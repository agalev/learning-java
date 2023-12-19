import java.util.Scanner;
public class ProgramStructure {
public static void main(String[] args) {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Print until?");
    // int input_number = Integer.valueOf(scanner.nextLine());
    // printUntilNumber(input_number);
    // scanner.close();
    // System.out.println(numberUno());
    // int answer = sum4(4, 3, 6, 1);
    // System.out.println("sum: " + answer);
    // System.out.println(smallest(1,2));
    // System.out.println(greatest(6,9,4));
    System.out.println(averageOf4(5,6,8,10));
    System.out.println(averageOf4(4,3,6,1));
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
public static int sum4(int number1, int number2, int number3, int number4) {
    return number1 + number2 + number3 + number4;
}
public static int smallest(int number1, int number2) {
    if (number1 < number2) {
        return number1;
    } else {
        return number2;
    }
}
public static int greatest(int number1, int number2, int number3) {
    if (number1 > number2 && number1 > number3) {
        return number1;
    } else if (number2 > number1 && number2 > number3) {
        return number2;
    } else {
        return number3;
    }
}
public static double averageOf4(int number1, int number2, int number3, int number4) {
    double to_average = sum4(number1, number2, number3, number4);
    return to_average / 4;
}
}
