package goserv.infra.ru.proc;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Board;
import goserv.infra.ru.model.Color;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public interface Action {
    Board initBoard(int size);

    void makeNewStep(int x, int y, Color color) throws StepNotAllowedException;

}
