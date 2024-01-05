public class Main {
    public static void main(String[] args) {
        // Menu menu = new Menu();
        // menu.addMeal("Tofu ratatouille");
        // menu.addMeal("Chilli coconut chicken");
        // menu.addMeal("Chilli coconut chicken");
        // menu.addMeal("Meatballs with mustard sauce");

        // menu.printMeals();
        // menu.clearMenu();

        // System.out.println();
        // menu.addMeal("Tomato and mozzarella salad");
        // menu.printMeals();

        // Stack s = new Stack();
        // System.out.println(s.isEmpty());
        // System.out.println(s.values());
        // s.add("Value");
        // System.out.println(s.isEmpty());
        // System.out.println(s.values());
        // String taken = s.take();
        // System.out.println(s.isEmpty());
        // System.out.println(s.values());
        // System.out.println(taken);

        Stack s = new Stack();
        s.add("1");
        s.add("2");
        s.add("3");
        s.add("4");
        s.add("5");

        while (!s.isEmpty()) {
            System.out.println(s.take());
        }
    }
}
