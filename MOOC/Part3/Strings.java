import java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
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
        // int oldest = 0;
        // String name_of_oldest = "";
        // while (true) {
        //     System.out.println("Type a phrase to split on the interval, empty to exit:");
        //     String[] input = scanner.nextLine().split(",");
        //     if (input[0].equals("")) {
        //         break;
        //     }
        //     String name = input[0];
        //     int age = Integer.valueOf(input[1]);
        //     if (oldest < age) {
        //         System.out.println("New oldest ~ " + age);
        //         oldest = age;
        //         name_of_oldest = name;
        //     }
            // printCSV(input);
            // for (String element: splitOnInterval(input)) {
                //     if (element.contains("av")) {
                    //         System.out.println(element);
                // }
        // System.out.println("Age of the oldest: " + oldest);
        // System.out.println("Name of the oldest: " + name_of_oldest);
        personalDetails();
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
    public static void personalDetails() {
        Scanner scanner = new Scanner(System.in);
        String longest_name = "";
        int birthYearSum = 0;
        int entries = 0;
        while (true) {
            System.out.print("Give me personal details in the format 'name,dob' ~ ");
            String[] input = scanner.nextLine().split(",");
            if (input[0].equals("")) {
                System.out.println("Longest name ~ " + longest_name);
                System.out.println("Average of the birth years ~ " + 1.0*birthYearSum/entries);
                break;
            }
            String current_name = input[0];
            int current_year = Integer.valueOf(input[1]);
            if (current_name.length() > longest_name.length()) {
                longest_name = current_name;
            }
            birthYearSum += current_year;
            entries += 1;
        }
        scanner.close();

    }
}
