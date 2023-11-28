import java.util.Scanner;

public class VariousVariables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a number:");
        int inputInt = Integer.valueOf(scanner.nextLine());
        System.out.println("You wrote the number " + inputInt);
        System.out.println("Write a decimal number:");
        double inputDouble = Double.valueOf(scanner.nextLine());
        System.out.println("You wrote the decimal number " + inputDouble);
        System.out.println("The sum of these two is " + (inputInt + inputDouble));
        scanner.close();
    }
}
