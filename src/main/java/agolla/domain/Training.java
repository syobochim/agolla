package agolla.domain;

import java.util.Objects;

public class Training {
    public final ID<Training> trainingID;
    public final String trainingName;

    public Training(String trainingName) {
        this.trainingID = ID.generate();
        this.trainingName = Objects.requireNonNull(trainingName);
    }
}
