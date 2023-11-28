import java.util.Scanner;
public class Sqrt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give 2 numbers:");
        int number1 = Integer.valueOf(scanner.nextLine());
        int number2 = Integer.valueOf(scanner.nextLine());
        double squareRoot = Math.sqrt(number1 + number2);
        System.out.println(squareRoot);
    }
}
