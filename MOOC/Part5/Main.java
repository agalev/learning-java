public class Main {
    public static void main(String[] args) {
        // Clock clock = new Clock();

        // while (true) {
        //     System.out.println(clock);
        //     clock.advance();
        //     try {
        //         Thread.sleep(1000);
        //     } catch (Exception e) {
        //         Thread.currentThread().interrupt();
        //     }
        // }

        // Timer timer = new Timer();

        // while (true) {
        //     System.out.println(timer);
        //     timer.advance();
        //     try {
        //         Thread.sleep(10);
        //     } catch(Exception e) {
        //         // Thread.currentThread().interrupt();
        //     }
        // }

        // Book harryBook = new Book("J.K. Rowling", "Harry Potter and the Sorcerer's Stone", 223);
        // System.out.println(harryBook);
        // Cube salt = new Cube(2);
        // System.out.println(salt.volume());
        // System.out.println(salt);
        // Fitbyte assistant = new Fitbyte(30, 60);

        // double percentage = 0.5;

        // while (percentage < 1.0) {
        //     double target = assistant.targetHeartRate(percentage);
        //     System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
        //     percentage = percentage + 0.1;
        // }
        // Product tapeMeasure = new Product("Tape measure");
        // Product plaster = new Product("Plaster", "home improvement section");
        // Product tyre = new Product("Tyre", 5);

        // System.out.println(tapeMeasure);
        // System.out.println(plaster);
        // System.out.println(tyre);
        // Counter counter = new Counter();
        // System.out.println(counter.value());

        // counter.increaseValue();
        // System.out.println(counter.value());

        // counter.increaseValue(3);
        // System.out.println(counter.value());

        // counter.decreaseValue(2);
        // System.out.println(counter.value());

        // counter.decreaseValue();
        // System.out.println(counter.value());

        // HealthStation childrensHospital = new HealthStation();

        // Person ethan = new Person("Ethan", 1, 110, 7);
        // Person peter = new Person("Peter", 33, 176, 85);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(peter);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);
        // childrensHospital.weigh(ethan);

        // System.out.println("weighings performed: " + childrensHospital.weighings());

        // PaymentCard petesCard = new PaymentCard(10);

        // System.out.println("money " + petesCard.balance());
        // boolean wasSuccessful = petesCard.takeMoney(8);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());

        // wasSuccessful = petesCard.takeMoney(4);
        // System.out.println("successfully withdrew: " + wasSuccessful);
        // System.out.println("money " + petesCard.balance());
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        double change = unicafeExactum.eatAffordably(10);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatAffordably(5);
        System.out.println("remaining change " + change);

        change = unicafeExactum.eatHeartily(4.3);
        System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);
 
    }
}
