package goserv.infra.ru.http;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Color;
import goserv.infra.ru.proc.BoardAction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class BoardControllerImpl implements BoardController {
    @Autowired
    BoardAction boardAction;


    @Override
    public int[][] startNewBoard(Integer size) {
        return new int[0][];
    }

    @Override
    public int[][] putStone(Integer x, Integer y, Color color) throws StepNotAllowedException {
        return new int[0][];
    }
}
