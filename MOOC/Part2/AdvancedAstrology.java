import java.util.Scanner;

public class AdvancedAstrology {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("We are printing a Christmas tree! How tall should it be? (int)");

    // printLeaningTriangle(4);
    christmasTree(Integer.valueOf(scanner.nextLine()));
    scanner.close();
 }
public static void printStars(int number) {
    for (int i = 0; i < number; i++) {
        System.out.print("*");
    }
}
public static void printSpaces(int number) {
    for (int i = 0; i < number; i++) {
        System.out.print(" ");
    }
}
public static void printLeaningTriangle(int size) {
    int spaces = size - 1;
    int stars = 1;
    while (spaces >= 0) {
        printSpaces(spaces);
        printStars(stars);
        System.out.println();
        spaces--;
        stars++;
    }
}
public static void christmasTree(int height) {
    int spaces = height - 1;
    int stars = 1;
    while (height > 0) {
        printSpaces(spaces);
        printStars(stars);
        printSpaces(spaces);
        System.out.println();
        spaces--;
        stars = stars + 2;
        height--;
    }
    // System.out.println("Stars are:" + stars);
        printSpaces(stars/2 - 2);
        printStars(3);
        System.out.println("");
        printSpaces(stars/2 - 2);
        printStars(3);
        System.out.println();
}
}
