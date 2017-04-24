package goserv.infra.ru.exceptions;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
public class StepNotAllowedException extends Throwable {
    public StepNotAllowedException(){
        super("Step not allowed!");
    }

}
