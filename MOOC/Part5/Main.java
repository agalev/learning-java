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
        Cube salt = new Cube(2);
        System.out.println(salt.volume());
        System.out.println(salt);
    }
}
