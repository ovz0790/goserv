package goserv.infra.ru.http;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.dto.GameDto;
import goserv.infra.ru.service.UserService;
import goserv.infra.ru.session.UserSessionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
@RestController
public class BoardControllerImpl implements BoardController {

    @Autowired
    private UserSessionData userSessionData;

    @Autowired
    private UserService userService;

    @Override
    public GameDto initNewGame(Integer size) {
        return userService.createUserGame(size);
    }

    @Override
    public GameDto connectToinitNewGame(String gameId) {
        return userService.connectToinitNewGame(gameId);
    }

    @Override
    public GameDto putStone(String gameId, Integer x, Integer y) throws StepNotAllowedException {
        return userService.putStone(gameId, x, y);
    }

    @Override
    public GameDto putStone(String gameId, HttpServletRequest httpServletRequest) throws StepNotAllowedException {
        return null;
    }
}
