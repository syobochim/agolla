package agolla.domain.repository;

import agolla.domain.Training;
import agolla.domain.Join;
import org.springframework.stereotype.Repository;

@Repository
public class DomaTrainingRepository implements TrainingRepository {
    @Override
    public Training create(Training training) {
        System.out.println("open: trainingID = " + training.trainingID + ", trainingName = " + training.trainingName);
        return null;
    }

    @Override
    public Join join(Join join) {
        System.out.println("join: training = " + join.training.trainingName + ", user = " + join.user.userName);
        return null;
    }
}
