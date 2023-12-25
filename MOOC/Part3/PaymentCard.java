public class PaymentCard {
    private double balance;
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }
    public String toString() {
        return "The card has a balance of $" + balance;
    }
    public void eatAffordably() {
        if (balance >= 2.60) {
            this.balance -= 2.60;
        }
    }
    public void eatHeartily() {
        if (balance >= 4.60) {
        this.balance -= 4.60;
        }
    }
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else {
            this.balance += amount;
        }
    }
}
