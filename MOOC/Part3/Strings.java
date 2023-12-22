import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("enter username ~~");
        // String user = scanner.nextLine();
        // System.out.print("enter password ~~");
        // String pw = scanner.nextLine();
        // if (login(user, pw)) {
        //     System.out.println("You have successfully logged in!");
        // } else {
        //     System.out.println("no dice");
        // }
        // checkIfStringEqualsTrue(scanner.nextLine());
        while (true) {
            System.out.println("Type a phrase to split on the interval, empty to exit:");
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            } else {printCSV(input);
                // for (String element: splitOnInterval(input)) {
                //     if (element.contains("av")) {
                //         System.out.println(element);
            }
        }
        scanner.close();
    }
    public static void printThrice(String word) {
        for (int i=0; i<4; i++) {
            System.out.print(word);
        }
        System.out.println();
    }
    public static void checkIfStringEqualsTrue(String word) {
        if (word.equals("true")) {
            System.out.println("You got it right!");
        } else {
            System.out.println("Try again!");
        }
    }
    public static boolean login(String username, String password) {
        if ((username.equals("alex") && password.equals("sunshine")) || (username.equals("emma") && password.equals("haskell"))) {
            return true;
        } else {
            return false;
        }
    }
    public static String[] splitOnInterval(String phrase) {
        return phrase.split(" ");
    }
    public static void printCSV(String input) {
        String[] values = input.split(",");
        System.out.println("Name: " + values[0] + ", age: " + values[1]);
    }
}
