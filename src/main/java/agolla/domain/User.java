package agolla.domain;

import java.util.Objects;

public class User {
    public final String userName;

    public User(String userName) {
        this.userName = Objects.requireNonNull(userName);
    }
}
