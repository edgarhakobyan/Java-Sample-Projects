import java.io.Serializable;

public class Group implements Serializable {
    private int id;

    public Group() {}

    public Group(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                '}';
    }
}
