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

        // Stack s = new Stack();
        // s.add("1");
        // s.add("2");
        // s.add("3");
        // s.add("4");
        // s.add("5");
        // s.add("6");
        // s.add("7");

        // while (!s.isEmpty()) {
        //     System.out.println(s.take());
        // }
        // MessagingService messenger = new MessagingService();
        // Message msg1 = new Message("Alex", "Hello");
        // Message msg2 = new Message("Mina", "Hello back");
        // messenger.add(msg1);
        // messenger.add(msg2);
        // System.out.println(messenger.getMessages());

        // Person matti = new Person("Matti");
        // matti.setWeight(86);
        // matti.setHeight(180);

        // Person juhana = new Person("Juhana");
        // juhana.setWeight(34);
        // juhana.setHeight(132);

        // AmusementParkRide hurjakuru = new AmusementParkRide("Hurjakuru", 140);
        // System.out.println(hurjakuru);

        // System.out.println();

        // if (hurjakuru.isAllowedOn(matti)) {
        //     System.out.println(matti.getName() + " is allowed on the ride");
        // } else {
        //     System.out.println(matti.getName() + " is not allowed on the ride");
        // }

        // if (hurjakuru.isAllowedOn(juhana)) {
        //     System.out.println(juhana.getName() + " is allowed on the ride");
        // } else {
        //     System.out.println(juhana.getName() + " is not allowed on the ride");
        // }

        // System.out.println(hurjakuru);

        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);
    }
}
