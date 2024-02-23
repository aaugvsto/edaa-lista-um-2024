package Entidades.Base;
import java.util.UUID;
public abstract class Entidade {
    protected UUID Id = UUID.randomUUID();

    public UUID getId() {
        return Id;
    }
}
