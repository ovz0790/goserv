package goserv.infra.ru.proc;

import goserv.infra.ru.model.Board;
import goserv.infra.ru.model.Color;
import goserv.infra.ru.model.Position;
import goserv.infra.ru.model.Stone;

import java.util.List;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public interface BoardProcess {
    boolean checkStepApply(Board board, Position position, Color  color);

    List<Stone> findDeadStone(Board board);

    void cleanDeadStone(Board board);
}
