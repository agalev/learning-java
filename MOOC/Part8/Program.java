import java.util.HashMap;
import java.util.ArrayList;

public class Program {
    private HashMap<String, String> map;

    public Program(HashMap<String, String> map) {
        this.map = map;
    }
    public void printKeys() {
        for (String key: this.map.keySet()) {
            System.out.println(key);
        }
    }

    public void printKeysWhere(String text) {
        for (String key: this.map.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }
    public void printValuesOfKeysWhere(String text) {
        for (String key: this.map.keySet()) {
            if (key.contains(text)) {
                System.out.println(this.map.get(key));
            }
        }
    }
}
