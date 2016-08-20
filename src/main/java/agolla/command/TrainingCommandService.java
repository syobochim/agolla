package agolla.command;

import agolla.domain.Training;
import agolla.domain.Join;
import agolla.domain.User;
import agolla.domain.repository.TrainingRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TrainingCommandService {

    private final TrainingRepository repository;

    public TrainingCommandService(TrainingRepository repository) {
        this.repository = repository;
    }

    public void openTraining(Training training) {
        repository.create(training);
    }

    public void joinTraining(Training training, User user) {
        Join join = Join.open(training, user);
        repository.join(join);
    }
}
