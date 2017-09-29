package goserv.infra.ru.service;

import goserv.infra.ru.model.Board;
import goserv.infra.ru.model.Game;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Scope(value="singleton", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
public class SessionGamesHolder {

    private final Map<String, Game> blackUserBoards = new HashMap<>();
    private final Map<String, Game> whiteUserBoards = new HashMap<>();
}
