package agolla.domain.repository;

import agolla.domain.Training;
import agolla.domain.Join;

public interface TrainingRepository {
    Training create(Training training);

    Join join(Join join);
}
