package fr.clam.edecision;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;
import java.io.Serializable;

@Entity
@Table(name = "projets")
public class projetEntity implements Serializable {

    @Id
    private UUID uuid;
    private String name;
    private Number state;
    private String description;

    public projetEntity() {
        this.uuid = UUID.randomUUID();
    }

    public projetEntity(String name, Number state, String description){
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.state = state;
        this.description = description;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Number getState() {
        return state;
    }

    public void setState(Number state) {
        this.state = state;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
