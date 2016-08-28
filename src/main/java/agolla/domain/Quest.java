package agolla.domain;

import java.util.Objects;

public class Quest {
    public final ID<Quest> questID;
    public final String questName;

    public Quest(String questName) {
        this.questID = ID.generate();
        this.questName = Objects.requireNonNull(questName);
    }
}
