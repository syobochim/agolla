package agolla.domain;

import java.io.Serializable;
import java.util.Objects;

public class Join implements Serializable{
    public final Quest quest;
    public final User user;

    public Join(Quest quest, User user) {
        this.quest = Objects.requireNonNull(quest);
        this.user = Objects.requireNonNull(user);
    }

    public static Join open(Quest quest, User user) {
        return new Join(quest, user);
    }
}
