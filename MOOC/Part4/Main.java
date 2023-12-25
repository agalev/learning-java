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
        // ArrayList<Item> items = new ArrayList<>();
        // while(true) {
        //     System.out.print("Name of object ~ ");
        //     String input = scanner.nextLine();
        //     if (input.isEmpty()) {
        //         scanner.close();
        //         break;
        //     }
        //     items.add(new Item(input));
        // }

        // for (Item item:items) {
        //     System.out.println(item);
        // }

        ArrayList<TelevisionProgram> TVs = new ArrayList<>();

         while(true) {
            System.out.print("Name of show ~ ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print (" Duration ~ ");
            int duration = Integer.valueOf(scanner.nextLine());
            TVs.add(new TelevisionProgram(name, duration));
        }

        System.out.print("Program's maximum duration? ~ ");
        int maxDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram program:TVs) {
            if (program.getDuration() < maxDuration) {
                System.out.println(program);
            }
            scanner.close();
        }
    }
}
