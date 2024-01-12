import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap<String, String> postalCodes = new HashMap<>();
        // postalCodes.put("93101", "Santa Barbara");
        // postalCodes.put("93105", "Foothill Rd");
        // System.out.println(postalCodes.get("93106"));
        Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        HashMap<String, Book> directory = new HashMap<>();
        directory.put(senseAndSensibility.getName(), senseAndSensibility);
        directory.put(prideAndPrejudice.getName(), prideAndPrejudice);
        directory.forEach(System.out.println());
    }
}
