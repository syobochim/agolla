package agolla.domain.repository;

import agolla.domain.Join;
import org.springframework.stereotype.Repository;

@Repository
public class DomaEventRepository implements EventRepository {
    @Override
    public Join save(Join join) {
        System.out.println("join: event = " + join.event.eventName + ", user = " + join.user.userName);
        return null;
    }
}
