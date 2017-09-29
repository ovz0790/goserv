package goserv.infra.ru.session;

import goserv.infra.ru.model.Color;
import goserv.infra.ru.model.User;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value="session", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Getter
@Setter
@Accessors(chain = true)
public class UserSessionData {

    private User user;

    private String sessionId;

}
