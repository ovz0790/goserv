package goserv.infra.ru.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class User {
    private String id;
    private String name;
    private String sessionId;
    private String password;
}
