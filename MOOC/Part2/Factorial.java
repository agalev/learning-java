import java.util.Scanner;
/*
 * Additional info:
 * Factorials are used especially in probability calculus when examining different possible orders of a set.
 * 
 * For example, a group of five people can form 5! different lines, and a pack of 52 cards can be in 52! different orders.
 * 
 * Factorial can also be used to calculate combinations;
 * For example it is possible to deal 52! / (5! * (52-5)!) different hands from a 52 card pack,
 * 
 * and
 * 
 * you can form 40! / (7! * (40 - 7)!) different 7 number lottery lines from 40 numbers.

 */
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
