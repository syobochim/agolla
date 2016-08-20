package agolla.domain.repository;

import agolla.domain.Join;

public interface EventRepository {
    Join save(Join join);
}
