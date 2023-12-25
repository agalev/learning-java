public class Statistics {
    private int count;
    private int sum;

    // public Statistics() {
    // }
    public void addNumber(int number) {
        this.count += 1;
        this.sum += number;
    }
    public int getCount() {
        return count;
    }
    public int sum() {
        return sum;
    }
    public double average() {
        return 1.0 * sum / count;
    }
}
