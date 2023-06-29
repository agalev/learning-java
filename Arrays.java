public class Arrays {
  public static void main(String[] args) {
    int[] arr;
    arr = new int[10];
    //prints don't work unless we loop through the array
    System.out.println(arr);
    System.out.println(arr.length);
    int[] arr2 = {1, 2, 3, 4, 5};
    System.out.println(arr2);
    for (int i=0; i < arr2.length; i++) {
      System.out.println(arr2[i]);
    }
  }
  
}
