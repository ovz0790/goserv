package goserv.infra.ru.model.dto;

import goserv.infra.ru.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class GameDto {
    private String gameId;
    private char[][] currentState;
    private User blackPlayer;
    private User whitePlayer;
    private ScoreDto score;
    private String gameTime;
    private String gameStartedDate;
    private String gameLastAttachedDate;
    private boolean canMakenextStep;
    private boolean hasRequestForStop;

}
