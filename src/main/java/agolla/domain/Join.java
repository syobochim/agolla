package agolla.domain;

import java.io.Serializable;
import java.util.Objects;

public class Join implements Serializable {
    public final Event event;
    public final User user;

    public Join(Event event, User user) {
        this.event = Objects.requireNonNull(event);
        this.user = Objects.requireNonNull(user);
    }

    public static Join open(Event event, User user) {
        return new Join(event, user);
    }
}
