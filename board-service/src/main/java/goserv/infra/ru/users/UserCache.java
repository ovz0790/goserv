package goserv.infra.ru.users;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Olga_Zlobina on 5/19/2017.
 */
@Component
public class UserCache {
    private final Map<String, Set<String>> userBoards = new ConcurrentHashMap<>();

    public void chacheUserBoard(String name, String boardId){
        if (userBoards.containsKey(name)){
            userBoards.get(name).add(boardId);
        } else {
            userBoards.put(name, Stream.of(boardId).collect(Collectors.toCollection(HashSet::new)));
        }
    }

  /*  public Board chacheUserBoard(String name){
        if (!userBoards.containsKey(name))
            return null;

        return userBoards.get(name).stream().findFirst().;
    }*/
}
