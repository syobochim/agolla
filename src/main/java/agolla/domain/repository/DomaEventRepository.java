package agolla.domain.repository;

import agolla.domain.Event;
import agolla.domain.Join;
import org.springframework.stereotype.Repository;

@Repository
public class DomaEventRepository implements EventRepository {
    @Override
    public Event create(Event event) {
        System.out.println("open: eventId = " + event.eventId + ", eventName = " + event.eventName);
        return null;
    }

    @Override
    public Join join(Join join) {
        System.out.println("join: event = " + join.event.eventName + ", user = " + join.user.userName);
        return null;
    }
}
