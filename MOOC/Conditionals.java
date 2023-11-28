import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftAmount = Integer.valueOf(scanner.nextLine());
        if (giftAmount < 5000) {
            System.out.println("No tax!");
        } else if (giftAmount > 5000 && giftAmount < 25000) {
            System.out.println("Tax: " + (100 + (giftAmount - 5000) * 0.08));
        } else if (giftAmount > 25000 && giftAmount < 55000) {
            System.out.println("Tax: " + (1700 + (giftAmount - 25000) * 0.1));
        } else if (giftAmount > 55000 && giftAmount < 200000) {
            System.out.println("Tax: " + (4700 + (giftAmount - 55000) * 0.12));
        } else if (giftAmount > 200000 && giftAmount < 1000000) {
            System.out.println("Tax: " + (22100 + (giftAmount - 200000) * 0.15));
        } else if (giftAmount > 1000000) {
            System.out.println("Tax: " + (142100 + (giftAmount - 1000000) * 0.17));
        }
        scanner.close();
    }
}