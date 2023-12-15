import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Give a number to start with:");
        int startWith = Integer.valueOf(scanner.nextLine());
        System.out.println("Give a number up to which we will add the sums of every previous one:");
        int upTo = Integer.valueOf(scanner.nextLine());
        for (int i = startWith; i <= upTo; i++) {
            sum+=i;
            System.out.println("Sum is now: " + sum);
        }
        System.out.println(sum);
        scanner.close();
    }
}
