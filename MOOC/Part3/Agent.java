public class Agent {
    private String firstName;
    private String lastName;
    public Agent(String first, String last) {
        this.firstName = first;
        this.lastName = last;
    }
    public String toString() {
        return "My name is " + lastName + ", " + firstName + " " + lastName;
    }
}
