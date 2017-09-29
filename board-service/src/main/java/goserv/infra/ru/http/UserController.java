package goserv.infra.ru.http;

import goserv.infra.ru.exceptions.UserAlreadyExistsException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

public interface UserController {
    @RequestMapping(value = "/board/user/login", method = RequestMethod.GET)
    void login(HttpServletRequest request, String user, String password);

    @RequestMapping(value = "/board/user/logout", method = RequestMethod.GET)
    void logout();

    @RequestMapping(value = "/board/user/{userName}/check", method = RequestMethod.GET)
    void ckeck(@PathVariable(name = "name") String userName) throws UserAlreadyExistsException;
}
