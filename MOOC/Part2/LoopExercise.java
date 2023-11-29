import java.util.Scanner;

public class LoopExercise {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int numbers = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers, '-1' quits:");

        while (true) {
            int input = Integer.valueOf(reader.nextLine());
            if (input == -1) {
                break;
            } else {
                if (input % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
                sum+=input;
                numbers++;
            }
        }
        System.out.println("Thxbai!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + numbers);
        System.out.println("Average: " + (double) sum/numbers);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);

    }
}
