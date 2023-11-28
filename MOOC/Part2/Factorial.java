import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double factorial = 1;
        System.out.println("Give the number up to which we're gonna be multiplying");
        int upTo = Integer.valueOf(scanner.nextLine());
        for (int i = 1; i <= upTo; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
        scanner.close();
    }
}
