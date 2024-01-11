import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int first = 0;
        int second = 0;
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scanner.nextLine();
            if(input.equals("quit")) {
                break;
            }
            String[] command = input.split(" ");

            if (command[0].equals("add")) {
                if ((Integer.valueOf(command[1]) + first) > 100) {
                    first = 100;
                } else if (Integer.valueOf(command[1]) < 0) {
                    continue;
                } else {
                    first += Integer.valueOf(command[1]);
                }
            } else if (command[0].equals("move")) {
                if (Integer.valueOf(command[1]) >= first) {
                    second += first;
                    first = 0;
                } else if (Integer.valueOf(command[1]) < 0) {
                    continue;
                } else if (Integer.valueOf(command[1]) <= first && (Integer.valueOf(command[1]) + second) > 100) {
                    first -= 100 - second;
                    second = 100;
                } else {
                    first -= Integer.valueOf(command[1]);
                    second += Integer.valueOf(command[1]);
                }
            } else if (command[0].equals("remove")) {
                if (Integer.valueOf(command[1]) < 0) {
                    continue;
                } else if (Integer.valueOf(command[1]) > second) {
                    second = 0;
                } else {
                    second -= Integer.valueOf(command[1]);
                }
            }
        }
    }
}
