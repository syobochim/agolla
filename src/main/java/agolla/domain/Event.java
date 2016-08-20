package agolla.domain;

import java.util.Objects;

public class Event {
    public final ID<Event> eventId;
    public final String eventName;

    public Event(String eventName) {
        this.eventId = ID.generate();
        this.eventName = Objects.requireNonNull(eventName);
    }
}
