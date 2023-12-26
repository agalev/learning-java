import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Person> persons = new ArrayList<>();
        
        // Person john = new Person("John");

        // persons.add(john);

        // persons.add(new Person("Brandy"));
        // persons.add(new Person("Bruce"));

        // for (Person person: persons) {
        //     System.out.println(person);
        // }

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

        // ArrayList<TelevisionProgram> TVs = new ArrayList<>();

        //  while(true) {
        //     System.out.print("Name of show ~ ");
        //     String name = scanner.nextLine();
        //     if (name.isEmpty()) {
        //         break;
        //     }
        //     System.out.print (" Duration ~ ");
        //     int duration = Integer.valueOf(scanner.nextLine());
        //     TVs.add(new TelevisionProgram(name, duration));
        // }

        // System.out.print("Program's maximum duration? ~ ");
        // int maxDuration = Integer.valueOf(scanner.nextLine());

        // for (TelevisionProgram program:TVs) {
        //     if (program.getDuration() < maxDuration) {
        //         System.out.println(program);
        //     }
        //     scanner.close();
        // }
        // ArrayList<String> array = new ArrayList<>();
        // System.out.println("Write a string. 'end' ends.");
        // while (true) {
        //     String input = scanner.nextLine();
        //     if (input.equals("end")) {
        //         System.out.println(array.size());
        //         break;
        //     }
        //     array.add(input);
        //     scanner.close();

        // Scanner fileName = new Scanner(System.in);
        // System.out.println("Enter the file name to read: ");
        // try (Scanner scanner = new Scanner(Paths.get(fileName.nextLine()))) {
        //     while (scanner.hasNextLine()) {
        //         String row[] = scanner.nextLine().split(",");
        //         String annotation = "";
        //         if (Integer.valueOf(row[1]) == 1) {
        //             annotation = "year";
        //         } else {
        //             annotation = "years";
        //         }
        //         System.out.println(row[0] + ", age: " + row[1] + " " + annotation);

        //     }
        // } catch (Exception e) {
        //     System.out.println("Error: " + e.getMessage());
        // }
        // fileName.close();
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter the filename:");
        // ArrayList<Person> persons = StoringRecords.readRecordsFromFile(input.nextLine());
        // for (Person person: persons) {
        //     System.out.println(person);
        // }
        // input.close();
        int games = 0;
        int wins = 0;
        int losses = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter File Name:");
        String fileName = scanner.nextLine();
        System.out.println("Enter Team Name:");
        String team = scanner.nextLine();

        try (Scanner fileRead = new Scanner(Paths.get(fileName))) {
            while (fileRead.hasNextLine()) {
                String[] row = fileRead.nextLine().split(",");
                if (row[0].equals(team) || row[1].equals(team)) {
                    games += 1;
                    if (row[0].equals(team) && Integer.valueOf(row[2]) > Integer.valueOf(row[3]) || row[1].equals(team) && Integer.valueOf(row[2]) < Integer.valueOf(row[3])) {
                        wins += 1;
                    } else {
                        losses += 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games played by " + team + ": " + games);
        System.out.println("WINS: " + wins);
        System.out.println("LOSSES: " + losses);
        scanner.close();
    }
}