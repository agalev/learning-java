import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // System.out.println("How many times would you like to be greeted?");
        // greet(Integer.valueOf(reader.nextLine()));

        // System.out.println("Give a number:");
        // printUntilNumber(Integer.valueOf(reader.nextLine()));

        // System.out.println("Give a number:");
        // printFromNumberToOne(Integer.valueOf(reader.nextLine()));
        
        // System.out.println("Give the first number:");
        // int first = Integer.valueOf(reader.nextLine());
        // System.out.println("Give the second number:");
        // int second = Integer.valueOf(reader.nextLine());
        // sum(first, second);

        // System.out.println("Give the numerator:");
        // int numerator = Integer.valueOf(reader.nextLine());
        // System.out.println("Give the denominator:");
        // int denominator = Integer.valueOf(reader.nextLine());
        // division(numerator, denominator);
        
        System.out.println("Give the beginning number:");
        int beginning = Integer.valueOf(reader.nextLine());
        System.out.println("Give the ending number:");
        int end = Integer.valueOf(reader.nextLine());
        divisibleByThreeInRange(beginning, end);

        reader.close();
    }
    public static void greet(int numOfTimes) {
        int i = 0;
        while (i < numOfTimes) {
            System.out.println("Greetings");
            i++;
        }
    }
    public static void printUntilNumber(int number) {
        int i = 1;
        while (i <= number) {
            System.out.println(i);
            i++;
        }
    }
    public static void printFromNumberToOne(int number) {
        int i = number;
        while (i > 0) {
            System.out.println(i);
            i--;
        }
    }
    public static void sum(int first, int second) {
        System.out.println("The sum of " + first + " and " + second + " is " + (first + second));
    }
    public static void subtraction(int first, int second) {
        System.out.println(first + " - " + second + " = " + (first - second));
    }
    public static void multiplication(int first, int second) {
        System.out.println(first + " * " + second + " = " + (first * second));
    }
    public static void division(int numerator, int denominator) {
        System.out.println(numerator + " / " + denominator + " = " + (double) numerator/denominator);
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        int i = beginning;
        while (i <= end) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    public static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
        System.out.println();
    }
}
