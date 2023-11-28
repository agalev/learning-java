import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else {
                sum = sum + input;
            }
        }
        System.out.println("The sum of the numbers is: " + sum);
        scanner.close();
    }
}
