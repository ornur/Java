import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Student("Adam", "Smith", 3.6));
        people.add(new Student("Chel", "Tipa", 2.4));
        people.add(new Student("Per", "Son", 3.1));

        people.add(new Employee("Nurs", "Akhmetov", "Senior Lector", 450000.0));
        people.add(new Employee("Nu", "Chi", "Intern", 0.0));
        people.add(new Employee("Dias", "Jaksylyk", "CEO", 1200000.0));

        Collections.sort(people, Person::compareTo);
        printData(people);
    }

    public static void printData(Iterable<Person> People) {
        for (Person person : People) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}