// import java.util.ArrayList;
// import java.util.Scanner;

import java.util.ArrayList;
import java.util.Scanner;

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
        // PaymentTerminal unicafeExactum = new PaymentTerminal();
        // System.out.println(unicafeExactum);

        // PaymentCard annesCard = new PaymentCard(2);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // boolean wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // unicafeExactum.addMoneyToCard(annesCard, 100);

        // wasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + wasSuccessful);

        // System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        // System.out.println(unicafeExactum);

        // Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        // Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        // Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        // System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        // System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

        // System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        // System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        // System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        // System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<Book> books = new ArrayList<>();
        // System.out.println("Enter book title + year of publication to add to books list:");
        // while (true) {
        //     System.out.println("Title (empty will stop):");
        //     String bookTitle = scanner.nextLine();
        //     if (bookTitle.equals("")) {
        //         break;
        //     }
        //     System.out.println("Publication year:");
        //     int bookYear = Integer.valueOf(scanner.nextLine());
        //     Book bookToAdd = new Book(bookTitle, bookYear);
        //     if (books.contains(bookToAdd)) {
        //         System.out.println("The book is already on the list. Let's not add the same book again.");
        //     } else {
        //         books.add(bookToAdd);
        //     }
        // }
        // System.out.println("Thank you! Books added: " + books.size());
        // scanner.close();
        // Money a = new Money(10,10);
        // Money b = new Money(5,0);

        // Money c = a.plus(b);

        // System.out.println(a);  // 10.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e

        // a = a.plus(c);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        // //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        // System.out.println(a);  // 25.00e
        // System.out.println(b);  // 5.00e
        // System.out.println(c);  // 15.00e

        // Money a = new Money(10, 0);
        // Money b = new Money(3, 0);
        // Money c = new Money(5, 0);

        // System.out.println(a.lessThan(b));  // false
        // System.out.println(b.lessThan(c));  // true
        // Money a = new Money(10, 0);
        // Money b = new Money(3, 50);

        // Money c = a.minus(b);

        // System.out.println(a);  // 10.00e
        // System.out.println(b);  // 3.50e
        // System.out.println(c);  // 6.50e

        // c = c.minus(a);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        // //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it


        // System.out.println(a);  // 10.00e
        // System.out.println(b);  // 3.50e
        // System.out.println(c);  // 0.00e
        }
}
