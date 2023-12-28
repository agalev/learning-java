public class Counter {
    private int value;

    public Counter() {
        this(0);
    }
    public Counter(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public void increaseValue() {
        increaseValue(1);
    }

    public void increaseValue(int number) {
        this.value = this.value + number;
    }

    public void decreaseValue() {
        decreaseValue(1);
        }

    public void decreaseValue(int number) {
        this.value = this.value - number;
    }
}
