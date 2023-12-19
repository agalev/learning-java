import java.util.Scanner;
public class ProgramStructure {
public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Print until?");
    // int input_number = Integer.valueOf(scanner.nextLine());
    // printUntilNumber(input_number);
    // scanner.close();
    System.out.println(numberUno());
}
public static void printText() {
    System.out.println("In a hole in the ground there lived a method");
}
public static void printUntilNumber(int number) {
    int i = 1;
    while (i <= number) {
        System.out.println(i);
        i++;
    }
}
public static int numberUno() {
    return 1;
}
}
