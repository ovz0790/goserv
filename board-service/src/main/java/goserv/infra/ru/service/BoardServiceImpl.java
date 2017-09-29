package goserv.infra.ru.service;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Board;
import goserv.infra.ru.model.Color;
import goserv.infra.ru.model.Step;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements  BoardService {

    @Autowired
    SessionGamesHolder sessionGamesHolder;

    public Board initBoard(int size, char[][] gandicaps) throws StepNotAllowedException {
        Board board = new Board()
                .setCurrentState(gandicaps == null ? new char[size][size] : gandicaps)
                .setCapturedBlack(0)
                .setCapturedWhite(0)
                .setSize(size);
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                if (gandicaps[i][j] == Color.WHITE.getColor() || gandicaps[i][j] == Color.BLACK.getColor()){
                    makeStep(board, i, j, Color.getByChar(gandicaps[i][j] ));
                }
            }
        }
        return board;
    }

    public void makeStep(Board board, int x, int y, Color color) throws StepNotAllowedException {
        Step step = board.getStep();

        if (!checkIfStepAllowed(board, x, y, color)){
            throw new StepNotAllowedException();
        }
        board.setStep(new Step().setPrevious(step).setColor(color).setX(x).setY(y));
    }

    private boolean checkIfStepAllowed(Board board, int x, int y, Color color){
        if (x < 0 || y < 0 || x >= board.getSize() || y >= board.getSize()){
            return false;
        }
        if (hasStone(board.getCurrentState(), x, y)){
            return false;
        }

        Points points = getSurroundPoints(board.getCurrentState(), x,y, color);
        if (points.getLiberty() == 0 && points.getSameColor() == 0){
            return false;
        }

        //TODO: check complex cases
        return true;
    }

    private Points getSurroundPoints(char[][] currentState, int x, int y, Color color){
        Points points = new Points();

        if (x-1 > 0) {
            incrPoints(currentState, x-1, y, color, points);
        }
        if (y-1 > 0){
            incrPoints(currentState, x, y-1, color, points);
        }
        if (x+1 < currentState.length){
            incrPoints(currentState, x+1, y, color, points);
        }
        if (y+1 < currentState.length){
            incrPoints(currentState, x, y+1, color, points);
        }
        return points;
    }

    private void incrPoints(char[][] currentState, int x, int y, Color color, Points points){
        if (!hasStone(currentState, x, y)) {
            points.incrEmpty();
        } else if (currentState[x][y] == color.getColor()){
            points.incrSameColor();
        } else {
            points.incrAnotherColor();
        }
    }

    private boolean hasStone(char[][] currentState, int x, int y){
       return currentState[x][y] == Color.WHITE.getColor() || currentState[x][y] == Color.BLACK.getColor();
    }

}
