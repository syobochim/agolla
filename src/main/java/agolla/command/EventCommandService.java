package agolla.command;

import agolla.domain.Event;
import agolla.domain.Join;
import agolla.domain.User;
import agolla.domain.repository.DomaEventRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EventCommandService {

    private final DomaEventRepository repository;

    public EventCommandService(DomaEventRepository repository) {
        this.repository = repository;
    }

    public void joinEvent(Event event, User user) {
        Join join = Join.open(event, user);
        repository.save(join);
    }
}
