import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Person> persons = new ArrayList<>();
        
        // Person john = new Person("John");

        // persons.add(john);

        // persons.add(new Person("Brandy"));
        // persons.add(new Person("Bruce"));

        // for (Person person: persons) {
        //     System.out.println(person);
        // }

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        while(true) {
            System.out.print("Name of object ~ ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                scanner.close();
                break;
            }
            items.add(new Item(input));
        }

        for (Item item:items) {
            System.out.println(item);
        }
        
    }
}
