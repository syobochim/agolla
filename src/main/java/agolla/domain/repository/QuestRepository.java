package agolla.domain.repository;

import agolla.domain.Quest;
import agolla.domain.Join;

public interface QuestRepository {
    Quest create(Quest quest);

    Join join(Join join);
}
