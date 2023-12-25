import java.util.Date;

public class Item {
    private String name;
    private Date createdAt;

    public Item(String initialName) {
        this.name = initialName;
        this.createdAt = new Date();
    }

    public String toString() {
        return this.name + " (created at: " + this.createdAt + ")";
    }
}
