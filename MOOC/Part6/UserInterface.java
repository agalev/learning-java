import java.util.Scanner;

public class UserInterface {
    private WordSet wordSet;
    private TodoList list;
    private Scanner scanner;

    public UserInterface(WordSet wordSet, Scanner scanner) {
        this.wordSet = wordSet;
        this.scanner = scanner;
        this.list = null;
    }

    public UserInterface(TodoList list, Scanner scanner) {
        this.scanner = scanner;
        this.list = list;
        this.wordSet = null;
    }

    public void start() {

        while (true) {
            System.out.print("Command: ");
            String word = scanner.nextLine();

            if (word.equals("stop")) {
                break;
            } else if (word.equals("add")) {
                System.out.println("To add: ");
                this.list.add(scanner.nextLine());
            } else if (word.equals("remove")) {
                System.out.println("ID of task to remove:");
                this.list.remove(Integer.valueOf(scanner.nextLine()));
            } else if (word.equals("list")) {
                this.list.print();
            } else {
                System.out.println("Unknown command");
            }
            // this.wordSet.add(word);

        }
    }
}