package goserv.infra.ru.service;

import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.exceptions.UserAlreadyExistsException;
import goserv.infra.ru.model.dto.GameDto;

import javax.servlet.http.HttpServletRequest;

public interface UserService {

    void login(HttpServletRequest request, String userName, String password);

    void logout();

    void checkIfUserExists(String userName) throws UserAlreadyExistsException;

    GameDto createUserGame(int size);

    GameDto connectToinitNewGame(String gameId);

    GameDto stopGame(String gameId);

    GameDto putStone(String gameId, Integer x, Integer y) throws StepNotAllowedException;

}
