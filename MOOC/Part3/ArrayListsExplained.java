import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListsExplained {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list_of_strings = new ArrayList<>();
        while (true) {
                System.out.println("Enter words to add to list, empty to exit:");
                String word = String.valueOf(scanner.nextLine());
                if (word.isEmpty()) {
                        break;
                    } else {
                    
                            addStringToArray(list_of_strings, word);
                            System.out.println("Current state of the list is:");
                            System.out.println(list_of_strings);
                        }
                    }
                    System.out.println("removing last...1");
                    removeLastString(list_of_strings);
                    System.out.println(list_of_strings);
                    System.out.println("removing last...2");
                    removeLastString(list_of_strings);
                    System.out.println(list_of_strings);
                    System.out.println("removing last...3");
                    removeLastString(list_of_strings);
                    System.out.println(list_of_strings);
                    System.out.println("removing last...4");
                    removeLastString(list_of_strings);
                    System.out.println(list_of_strings);
        //             System.out.println("Search for?");
        //             String input = scanner.nextLine();
        //             if (findWordMatch(list_of_strings, input)) {
        //                 System.out.println(input + " was found :)");
        //             } else {
        //                 System.out.println(input + " was not found :(");
        //             }

                    // System.out.print("In total: ");
                    // System.out.println(list_of_strings.size());
                    // System.out.print("Last element added: ");
                    // System.out.println(list_of_strings.get(list_of_strings.size()-1));
                    
                    // System.out.println("print each word in the array on a new line:");
                    // for (int i = 0; i < list_of_strings.size(); i++) {
                    //         System.out.println(list_of_strings.get(i));
                    //     }
                    //     System.out.println("Print in reverse:");
                    //     for (int i = list_of_strings.size() - 1; i >= 0; i--) {
                    //             System.out.println(list_of_strings.get(i));
                    //         }
                        
        // ArrayList<Integer> list_of_integers = new ArrayList<>();
        // while (true) {
        //     System.out.println("Enter numbers to add to the array list, -1 to exit:");
        //     int input = Integer.valueOf(scanner.nextLine());
        //     if (input == -1) {
        //         break;
        //     } else {
        //         list_of_integers.add(input);
        //         System.out.println("Current state of the list is:");
        //         System.out.println(list_of_integers);
        //     }
        // }
        // System.out.println("The numbers in the range [0, 5]");
        // printNumbersInRange(list_of_integers, 0, 5);
        // System.out.println("The numbers in the range [3, 10]");
        // printNumbersInRange(list_of_integers, 3, 10);
        // indexOfSmallest(list_of_integers);
        // System.out.println(sumList(list_of_integers));
        // System.out.println(avgList(list_of_integers));
        // System.out.println("Let's look for a number in the array! Which number would you like to check? ~");
        // findNumberInArray(list_of_integers, Integer.valueOf(scanner.nextLine()));
        // System.out.println("we're printing the numbers one each line:");
        // for (int i = 0; i <= list_of_integers.size() - 1; i++) {
        //     System.out.println(list_of_integers.get(i));
        // }
        // System.out.println("I ask you a range of which the numbers will be printed:");
        // System.out.println("Start at:");
        // int start = Integer.valueOf(scanner.nextLine());
        // System.out.println("End at:");
        // int end = Integer.valueOf(scanner.nextLine());
        // System.out.println("Printing the numbers of the array between " + start + " and " + end + ":");
        // while (start <= end) {
        //     System.out.println(list_of_integers.get(start));
        //     start++;
        // }

        // System.out.println("Summing the second and third elements of the numbers array:");
        // System.out.print(list_of_integers.get(1));
        // System.out.print(" + ");
        // System.out.print(list_of_integers.get(2));
        // System.out.print(" = ");
        // System.out.print(list_of_integers.get(1)+list_of_integers.get(2));

        scanner.close();
    }
    public static void addStringToArray(ArrayList list_to_add, String word_to_add) {
        list_to_add.add(word_to_add);
        System.out.println(list_to_add);
    }
    public static void indexOfSmallest(ArrayList<Integer> list) {
        int smallest = list.get(0);
        for (int i = 0; i <= list.size() - 1; i++) {
            int number = list.get(i);
            if (smallest > number) {
                smallest = number;
            }
        }
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
    public static void findNumberInArray(ArrayList<Integer> list, int number_to_find) {
        for (int i = 0; i <= list.size() - 1; i++) {
            if (list.get(i) == number_to_find) {
                System.out.println(number_to_find + " is at index " + i);
            }
        }
    }
    public static int sumList(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer index: list) {
            sum += index;
        }
        return sum;
    }
    public static double avgList(ArrayList<Integer> list) {
        return 1.0*sumList(list)/list.size();
    }
    public static boolean findWordMatch(ArrayList<String> list, String find_word) {
        return list.contains(find_word);
    }
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        for (Integer number: list) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
    public static void removeLastString(ArrayList<String> list) {
        if (list.size() == 0) {
            return;
        }
        list.remove(list.size() -1);
    }
}
