package goserv.infra.ru.http;
import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.Color;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Olga_Zlobina on 4/19/2017.
 */
@RestController
public interface BoardController {

    @RequestMapping(value = "/board/new", method = RequestMethod.GET)
    @ResponseBody
    int[][] startNewBoard(@PathVariable("size") Integer size);


    @RequestMapping(value = "/board/move", method = RequestMethod.GET)
    @ResponseBody
    int[][] putStone(@PathVariable("x") Integer x, @PathVariable("y") Integer y, @PathVariable("color") Color color) throws StepNotAllowedException;


}
