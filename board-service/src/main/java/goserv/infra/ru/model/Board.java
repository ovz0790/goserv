package goserv.infra.ru.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Board {
    private Step step;

    private int size;

    private char[][] currentState;

    private int capturedBlack;

    private int capturedWhite;
}
