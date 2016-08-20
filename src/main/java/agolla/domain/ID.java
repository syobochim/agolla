package agolla.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ID<ENTITY> implements Serializable {

    public final UUID value;

    public ID(UUID value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getClass(), value);
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj || (obj != null && getClass() == obj.getClass()
                && value.equals(getClass().cast(obj).value));
    }

    @Override
    public String toString() {
        return value.toString();
    }

    public static <T> ID<T> generate() {
        UUID value = UUID.randomUUID();
        return new ID<>(value);
    }
}
