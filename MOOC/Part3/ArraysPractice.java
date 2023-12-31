import java.util.Scanner;

public class ArraysPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many elements should the array have?");
        int input = Integer.valueOf(scanner.nextLine());
        System.out.println("We are creating an array with " + input + " elements!");
        int[] array = new int[input];
        for (int i = 0; i < input; i++) {
            System.out.println("Element sitting on index " + i + ":");
            array[i] = Integer.valueOf(scanner.nextLine());
        }
        System.out.println("Here is the completed array ~");
        printNeatly(array);
        System.out.println("Sum of the array: " + sumOfNumbersInArray(array));
        System.out.println("Print array in stars:");
        printArrayInStars(array);
        // System.out.println("Search for?");
        // int element = Integer.valueOf(scanner.nextLine());
        // findNumber(array, element);
        // System.out.println("Let's swap 2 indices!");
        // swap2indices(array, Integer.valueOf(scanner.nextLine()), Integer.valueOf(scanner.nextLine()));
        // printArray(array);
        scanner.close();
    }
    public static void printArray(int[] array) {
        for (int number: array) {
            System.out.println(number);
        }
    }
    public static void swap2indices(int[] array, int indice1, int indice2) {
        System.out.println("Swapping elements " + array[indice1] + " and " + array[indice2]);
        int helper = array[indice1];
        array[indice1] = array[indice2];
        array[indice2] = helper;
    }
    public static void findNumber(int[] array, int number) {
        int index = 0;
        boolean found = false;
        while (index < array.length) {
            if (array[index] == number) {
                found = true;
                System.out.println(number + " was found at index " + index);
            }
            index++;
        }
            if (!found) {
                System.out.println(number + " was not found.");
            }
    }
    public static int sumOfNumbersInArray(int[] array) {
        int sum = 0;
        for (int element:array) {
            sum += element;
        }
        return sum;
    }
    public static void printNeatly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
    }
    public static void printArrayInStars(int[] array) {
        for (int element:array) {
            for (int star = 0; star < element; star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
