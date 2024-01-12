import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap<String, String> postalCodes = new HashMap<>();
        // postalCodes.put("93101", "Santa Barbara");
        // postalCodes.put("93105", "Foothill Rd");
        // System.out.println(postalCodes.get("93106"));
        // Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        // Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        // HashMap<String, Book> directory = new HashMap<>();
        // directory.put(senseAndSensibility.getName(), senseAndSensibility);
        // directory.put(prideAndPrejudice.getName(), prideAndPrejudice);

        // Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
        // Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

        // Library library = new Library();
        // library.addBook(senseAndSensibility);
        // library.addBook(prideAndPrejudice);

        // System.out.println(library.getBook("pride and prejudice"));
        // System.out.println();

        // System.out.println(library.getBook("PRIDE AND PREJUDICE"));
        // System.out.println();

        // System.out.println(library.getBook("SENSE"));
        // Abbreviations abbreviations = new Abbreviations();
        // abbreviations.addAbbreviation("e.g.", "for example");
        // abbreviations.addAbbreviation("etc.", "and so on");
        // abbreviations.addAbbreviation("i.e.", "more precisely");

        // String text = "e.g. i.e. etc. lol";

        // for (String part: text.split(" ")) {
        //     if(abbreviations.hasAbbreviation(part)) {
        //         part = abbreviations.findExplanationFor(part);
        //     }

        //     System.out.print(part);
        //     System.out.print(" ");
        // }

        // System.out.println();

        // HashMap<String, String> hashmap = new HashMap<>();
        // hashmap.put("f.e", "for example");
        // hashmap.put("etc.", "and so on");
        // hashmap.put("i.e", "more precisely");

        // Program program = new Program(hashmap);
        // program.printKeys();
        // System.out.println("---");
        // program.printKeysWhere("i");
        // System.out.println("---");
        // program.printValuesOfKeysWhere(".e");

        // HashMap<String, Integer> newone = new HashMap<>();

        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Arthur", 10.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));

    }
}
