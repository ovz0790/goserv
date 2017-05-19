package goserv.infra.ru.users;

import goserv.infra.ru.model.Board;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Olga_Zlobina on 5/19/2017.
 */
@Component
public class BoardCache {
    private final Map<String , Board> currentBoards = new ConcurrentHashMap<>();

    public void chacheUserBoard(Board board){
        currentBoards.put(board.getBoardId(), board);
    }

    public Board chacheUserBoard(String boardId){
        if (!currentBoards.containsKey(boardId))
            return null;

        return currentBoards.get(boardId);
    }
}
