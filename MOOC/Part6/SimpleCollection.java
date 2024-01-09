import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> collection;

    public SimpleCollection(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public void add(String string) {
        this.collection.add(string);
    }

    public String longest() {
        if (this.collection.isEmpty()) {
            return null;
        }

        String toReturn = this.collection.get(0);
        for (String str:this.collection) {
            if (str.length() > toReturn.length()) {
                toReturn = str;
            }
        }
        return toReturn;
    }

    public String toString() {
        String toReturn = "The collection characters has " + this.collection.size() + " elements:\n";
        if (this.collection.isEmpty()) {
            return "Nothing to show";
        }

        for (String string: collection) {
            toReturn += string + "\n";
        }
        return toReturn;
    }

}
