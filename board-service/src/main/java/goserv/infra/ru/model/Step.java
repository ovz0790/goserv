package goserv.infra.ru.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Step {
    private Step previous;

    private int x;
    private int y;

    private Color color;

}
