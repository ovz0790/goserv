package goserv.infra.ru.http;

import goserv.infra.ru.exceptions.UserAlreadyExistsException;
import goserv.infra.ru.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserControllerImpl implements UserController{

    @Autowired
    UserService userService;

    @Override
    public void login(HttpServletRequest request, String user, String password) {
        userService.login(request, user, password);
    }

    @Override
    public void logout() {
        userService.logout();
    }

    @Override
    public void ckeck(String userName) throws UserAlreadyExistsException {
        userService.checkIfUserExists(userName);
    }
}
