package agolla.domain;

import java.io.Serializable;
import java.util.Objects;

public class Join implements Serializable{
    public final Training training;
    public final User user;

    public Join(Training training, User user) {
        this.training = Objects.requireNonNull(training);
        this.user = Objects.requireNonNull(user);
    }

    public static Join open(Training training, User user) {
        return new Join(training, user);
    }
}
