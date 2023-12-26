public class Person {
    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName, int age) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public String getName() {
        return name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }
    
    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + this.bodyMassIndex();
    }
}
