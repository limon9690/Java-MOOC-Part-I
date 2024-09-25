import java.util.ArrayList;

public class Room {
    ArrayList<Person> persons;

    public Room () {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person p = persons.get(0);

        for (Person per : persons) {
            if (per.getHeight() < p.getHeight()) {
                p = per;
            }
        }

        return p;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person p = this.shortest();

        this.persons.remove(p);
        return p;
    }
    
}
