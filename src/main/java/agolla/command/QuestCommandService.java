package agolla.command;

import agolla.domain.Quest;
import agolla.domain.Join;
import agolla.domain.User;
import agolla.domain.repository.DomaQuestRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestCommandService {

    private final DomaQuestRepository repository;

    public QuestCommandService(DomaQuestRepository repository) {
        this.repository = repository;
    }

    public void openQuest(Quest quest) {
        repository.create(quest);
    }

    public void joinQuest(Quest quest, User user) {
        Join join = Join.open(quest, user);
        repository.join(join);
    }
}
