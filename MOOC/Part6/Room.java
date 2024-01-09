import java.util.ArrayList;

public class Room {
    private ArrayList<Person> people;

    public Room() {
        this.people = new ArrayList<>();
    }

    public void add(Person person) {
        this.people.add(person);
    }

    public boolean isEmpty() {
        if (this.people.isEmpty()) {
            return true;
        }
        return false;
    }

    public Person shortest() {
        if (this.people.isEmpty()) {
            return null;
        }
        
        Person toReturn = this.people.get(0);
        for(Person person: this.people) {
            if (person.getHeight() < toReturn.getHeight()) {
                toReturn = person;
            }
        }
        return toReturn;
    }

    public Person take() {
        if (this.isEmpty()) {
            return null;
        }

        Person toReturn = this.shortest();
        this.people.remove(toReturn);

        return toReturn;
    }

    public ArrayList<Person> getPersons() {
        return this.people;
    }
    
}
