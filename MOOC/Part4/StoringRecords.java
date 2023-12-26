import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class StoringRecords {
    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> people = new ArrayList<>();
        try (Scanner scanner = new Scanner(Paths.get(file))) {
            while (scanner.hasNextLine()) {
                String[] row = scanner.nextLine().split(",");
                people.add(new Person(row[0], Integer.valueOf(row[1])));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return people;
    }
}
