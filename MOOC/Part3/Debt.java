public class Debt {
    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialInterest) {
        this.balance = initialBalance;
        this.interestRate = initialInterest;
    }
    public void printBalance() {
        System.out.println("balance: " + this.balance);
    }
    public void waitOneYear() {
        this.balance = this.balance + (this.balance * this.interestRate) / 100;
    }
}
