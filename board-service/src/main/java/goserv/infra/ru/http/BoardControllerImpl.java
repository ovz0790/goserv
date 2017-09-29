package goserv.infra.ru.http;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Color;
import goserv.infra.ru.model.dto.GameDto;
import goserv.infra.ru.proc.BoardAction;
import goserv.infra.ru.session.UserSessionData;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class BoardControllerImpl implements BoardController {
    @Autowired
    BoardAction boardAction;
    @Autowired
    private UserSessionData userSessionData;


    @Override
    public GameDto initNewGame(Integer size, HttpServletRequest httpServletRequest) {
        return null;
    }

    @Override
    public GameDto connectToinitNewGame(String gameId, HttpServletRequest httpServletRequest) {
        return null;
    }

    @Override
    public GameDto putStone(String gameId, Integer x, Integer y, HttpServletRequest httpServletRequest) throws StepNotAllowedException {
        return null;
    }

    @Override
    public GameDto putStone(String gameId, HttpServletRequest httpServletRequest) throws StepNotAllowedException {
        return null;
    }
}
