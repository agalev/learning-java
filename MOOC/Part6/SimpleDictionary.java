import java.util.HashMap;
import java.util.Map;

public class SimpleDictionary {
    private Map<String, String> dictionary;

    public SimpleDictionary() {
        this.dictionary = new HashMap<>();
    }

    public void add(String english, String finnish) {
        this.dictionary.put(english, finnish);
    }

    public String translate(String english) {
        String translation = this.dictionary.get(english);
        return (translation != null) ? translation : "Word " + english + " was not found";
    }
}
