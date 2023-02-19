public class Person implements Payable, Comparable<Person> {
    private static int idC = 1;
    private final int id;
    protected String name;
    protected String surname;

    public Person() {
        id = idC++;
    }

    public Person(String name, String surname) {
        this();
        setName(name);
        setSurname(surname);
    }

    @Override
    public String toString() {
        return getID() + ". " + getName() + " " + getSurname();
    }

    public int getID() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0;
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(person.getPaymentAmount(), getPaymentAmount());
    }
}
