package goserv.infra.ru.service;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Board;
import goserv.infra.ru.model.Color;
import lombok.Getter;
import lombok.experimental.Accessors;

public interface BoardService {

    Board initBoard(int size, char[][] gandicaps) throws StepNotAllowedException;

    void makeStep(Board board, int x, int y, Color color) throws StepNotAllowedException;

    @Accessors(chain = true)
    @Getter
    class Points {
        int liberty = 0;
        int sameColor = 0;
        int anotherColor = 0;

        public void incrEmpty(){
            this.liberty++;
        }

        public void incrSameColor(){
            this.sameColor++;
        }

        public void incrAnotherColor(){
            this.anotherColor++;
        }
    }

}
