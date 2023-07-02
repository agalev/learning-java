class Point {
    private double x;
    private double y;
    
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void print() {
        System.out.println("(" + x + "," + y + ")");
    }

    public void scale() {
        x = x * 0.5;
        y = y * 0.5;
    }
    
    // Your code goes here
}