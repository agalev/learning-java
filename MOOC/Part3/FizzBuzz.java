public class FizzBuzz {
    public static void main(String[] args) {
        String[] result = fbSolution(15);
        for (String element: result) {
            System.out.println(element);
        }
    }
    public static String[] fbSolution(int n) {
        String[] fb = new String[n];
        for (int i=1; i<=n; i++) {
            if (i%5==0 && i%3==0) {
                fb[i-1]="FizzBuzz";
            } else if (i%3==0) {
                fb[i-1]="Fizz";
            } else if (i%5==0) {
                fb[i-1]="Buzz";
            } else {
                fb[i-1]=String.valueOf(i);
            }
        }
    return fb;
    }
}
