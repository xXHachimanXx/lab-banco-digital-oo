import java.util.UUID;

public abstract class AbstractEntity {
    private UUID id;
    private boolean active;

    public AbstractEntity() {
        id = UUID.randomUUID();
        active = true;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
