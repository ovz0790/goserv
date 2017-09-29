package goserv.infra.ru.http;
import goserv.infra.ru.exceptions.StepNotAllowedException;
import goserv.infra.ru.model.dto.GameDto;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * REST API for playing GO
 * Created by Olga_Zlobina on 4/19/2017.
 */
public interface BoardController {

    /**
     * request for init new game
     * @param size Board size
     * @return Game with all attributes
     */
    @RequestMapping(value = "/board/new", method = RequestMethod.GET)
    @ResponseBody
    GameDto initNewGame(@RequestParam(name = "size") Integer size);


    /**
     * Agree connect for playing with existing game request. Colors for plyer will be setted by random
     * @param gameId Id of existing game request
     * @return Updated game with all attributes
     */
    @RequestMapping(value = "/board/{gameId}/connect", method = RequestMethod.GET)
    @ResponseBody
    GameDto connectToinitNewGame(@PathVariable(name = "game") String gameId);


    /**
     * Make a new Step. Color of the stone will be defined in user info
     * @param gameId  Id of current game
     * @param x position on board
     * @param y position on board
     * @return Updated game with all attributes
     * @throws StepNotAllowedException
     */
    @RequestMapping(value = "/board/{gameId}/{x}/{y}", method = RequestMethod.GET)
    @ResponseBody
    GameDto putStone(@PathVariable(name = "game") String gameId,
                     @PathVariable("x") Integer x,
                     @PathVariable("y") Integer y) throws StepNotAllowedException;

    /**
     * request for stop the game. Game will be finished finally when all players called this API
     * @param gameId Id of current game
     * @return updated game info with score
     * @throws StepNotAllowedException
     */
    @RequestMapping(value = "/board/{gameId}/stop", method = RequestMethod.GET)
    @ResponseBody
    GameDto stopGame(@PathVariable(name = "game") String gameId) throws StepNotAllowedException;

}
