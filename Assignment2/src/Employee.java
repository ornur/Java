public class Employee extends Person {
    protected String position;
    protected double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, Double salary) {
        super(name, surname);
        setPosition(position);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee: " + getID() + ". " + this.name + " " + this.surname;
    }

    @Override
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public double getPaymentAmount() {
        return getSalary();
    }
}
