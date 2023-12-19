public class PrintingStars {
public static void main(String[] args) {
    // printSquare(4);
    // printRectangle(17,3);
    printTriangle(4);
}
public static void printStars(int number) {
    for (int i = 0; i < number; i++) {
        System.out.print("*");
    }
}
public static void printSquare(int size) {
    int per_lane = size;
    while (size > 0) {
        printStars(per_lane);
        System.out.println("");
        size--;
    }
}
public static void printRectangle(int width, int height) {
while (height > 0) {
    printStars(width);
    System.out.println("");
    height--;
}
}
public static void printTriangle(int size) {
    for (int i = 1; i <= size; i++) {
        printStars(i);
        System.out.println("");
    }
}
}
