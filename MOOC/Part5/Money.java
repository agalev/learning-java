public class Money {

    private final int dollars;
    private final int cents;

    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int dollars() {
        return dollars;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money((this.dollars + addition.dollars), (this.cents + addition.cents));
        return newMoney;
    }

    public Money minus(Money decreaser) {
        if (this.lessThan(decreaser)) {
            return new Money(0, 0);
        } else if (this.cents < decreaser.cents) {
            return new Money((this.dollars - 1 - decreaser.dollars), (this.cents + 100 - decreaser.cents));
        } else {
            return new Money((this.dollars-decreaser.dollars), (this.cents - decreaser.cents));
        }
    }

    public boolean lessThan(Money compared) {
        if (this.dollars > compared.dollars || 
            (this.dollars == compared.dollars && this.cents > compared.cents)) {
            return false;
            }
        return true;
    }

    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return "$" + dollars + "." + zero + cents;
    }
}