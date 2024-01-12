import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> postalCodes = new HashMap<>();
        postalCodes.put("93101", "Santa Barbara");
        postalCodes.put("93105", "Foothill Rd");
        System.out.println(postalCodes.get("93106"));
    }
}
