import java.util.ArrayList;

public class Stack {
    private ArrayList<String> valuesList;

    public Stack() {
        this.valuesList = new ArrayList<>(); 
    }

    public boolean isEmpty() {
        if (this.valuesList.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(String value) {
        this.valuesList.add(value);
    }

    public ArrayList<String> values() {
        return this.valuesList;
    }
}
