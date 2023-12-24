public class Main {
    public static void main(String[] args) {
        // Account Jamey = new Account("Jamey", 100.00);
        // Jamey.printDetails();
        // Jamey.withdraw(20);
        // Jamey.printDetails();
        // Jamey.deposit(40.5);
        // Jamey.printDetails();
        // Whistle ravenWhistle = new Whistle("Kvaak");
        // ravenWhistle.sound();
        // Door wooden = new Door();
        // wooden.knock();
        // Product banana = new Product("Banana", 1.1, 13);
        // banana.printProduct();
        // DecreasingCounter counter = new DecreasingCounter(5);
        // counter.printValue();

        // counter.decrement();
        // counter.printValue();

        // counter.decrement();
        // counter.printValue();

        // counter.reset();
        // counter.printValue();

        // counter.decrement();
        // counter.printValue();
        Debt flatironDebt = new Debt(20000, 10);
        flatironDebt.printBalance();

        flatironDebt.waitOneYear();
        flatironDebt.printBalance();
        
        int years = 0;
        while (years < 10) {
            flatironDebt.waitOneYear();
            years += 1;
            flatironDebt.printBalance();
        }

    }
}
