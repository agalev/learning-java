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

        Timer timer = new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();
            try {
                Thread.sleep(10);
            } catch(Exception e) {
                // Thread.currentThread().interrupt();
            }
        }
    }
}
