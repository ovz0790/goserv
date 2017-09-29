package goserv.infra.ru.proc;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.old.Board;
import goserv.infra.ru.model.old.Stone;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public interface BoardAction extends BoardProcessChecks{

    void cleanBoard(Board board);

    void makeStep(Stone stone, Board board) throws StepNotAllowedException;

    void goPrevStep(int depth, Board board);

    void goForwordStep(int depth, Board board);
}
