package agolla.domain.repository;

import agolla.domain.Event;
import agolla.domain.Join;

public interface EventRepository {
    Event create(Event event);

    Join join(Join join);
}
