package agolla.domain.repository;

import agolla.domain.Quest;
import agolla.domain.Join;
import org.springframework.stereotype.Repository;

@Repository
public class DomaQuestRepository implements QuestRepository {
    @Override
    public Quest create(Quest quest) {
        System.out.println("open: questId = " + quest.questID + ", questName = " + quest.questName);
        return null;
    }

    @Override
    public Join join(Join join) {
        System.out.println("join: quest = " + join.quest.questName + ", user = " + join.user.userName);
        return null;
    }
}
