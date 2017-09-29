package goserv.infra.ru.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Game {

    private User blackUser;
    private User whiteUser;
    private Board board;
    private String id;
}
