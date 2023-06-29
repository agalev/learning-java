public class Loops {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    //regular for loop
    for (int i=0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
    //enhanced for loop(forEach) - only works with arrays
    for (int num : arr) {
      System.out.println(num);
    }

    int i = 0;
    //while loop
    while (i < arr.length) {
      System.out.println(arr[i]);
      i++;
    }
    i = 0;
    //do while loop
    do {
      System.out.println(arr[i]);
      i++;
    } while (i < arr.length);
    //break and continue
    for (int j=0; j < arr.length; j++) {
      if (j == 2) {
        break;
      }
      System.out.println(arr[j]);
    }
    for (int j=0; j < arr.length; j++) {
      if (j == 2) {
        continue;
      }
      System.out.println(arr[j]);
    }
  }

  
}
