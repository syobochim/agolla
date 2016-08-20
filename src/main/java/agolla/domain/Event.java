package agolla.domain;

import java.util.Objects;

public class Event {
    public final String eventName;

    public Event(String eventName) {
        this.eventName = Objects.requireNonNull(eventName);
    }
}
