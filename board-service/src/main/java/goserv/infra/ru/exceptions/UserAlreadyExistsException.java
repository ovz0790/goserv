package goserv.infra.ru.exceptions;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class UserAlreadyExistsException extends Throwable {
    public UserAlreadyExistsException(String name){
        super("User with name ".concat(name).concat(" already exists!"));
    }

}
