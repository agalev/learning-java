public class Account {
    private String name;
    private double balance;

    public Account(String initialName, double initialBalance) {
        this.name = initialName;
        this.balance = initialBalance;
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }
    public void printDetails() {
        System.out.println("Account name: " + this.name + " Account balance: " + this.balance);
    }
}
