package goserv.infra.ru.model;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.util.*;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class Board {
    private int size;
    private List<Stone> board;
    private List<List<Stone>> history;
    private Map<Color, Integer> score;
    private boolean isFinished = false;
    public int getSize() {
        return size;
    }
    private String boardId;

    public Board(){
        initBosrd(19);
    }

    public Board(int size){
        initBosrd(size);
    }

    private void initBosrd(int size){
        this.score = new HashMap<>(2);
        this.score.put(Color.BLACK, 0);
        this.score.put(Color.WHITE, 0);

        this.board = new ArrayList<>();

        this.history = new ArrayList<>();

        this.size = size;

        this.boardId = UUID.randomUUID().toString();
    }

    public String getBoardId() {
        return boardId;
    }


    public List<Stone> getBoard() {
        return board;
    }
    public List<List<Stone>> getHistory() {
        return history;
    }

    public Map<Color, Integer> getScore() {
        return score;
    }
    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

}
