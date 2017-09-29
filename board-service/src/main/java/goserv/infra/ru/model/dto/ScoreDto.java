package goserv.infra.ru.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ScoreDto {

    private int whiteCaptured;
    private int blackCaptured;

}
