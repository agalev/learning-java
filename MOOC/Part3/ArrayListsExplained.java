import java.util.ArrayList;

public class ArrayListsExplained {
    public static void main(String[] args) {
        ArrayList<Integer> list_of_integers = new ArrayList<>();
        list_of_integers.add(1);
        list_of_integers.add(2);
        list_of_integers.add(3);
        // System.out.println(list_of_integers);
        // System.out.println(list_of_integers.size());
        // System.out.println(list_of_integers.get(2));
        // System.out.println(list_of_integers.getFirst());
        // System.out.println(list_of_integers.indexOf(2))
        System.out.println(list_of_integers.sort());
    }
}
