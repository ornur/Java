public class Student extends Person {
    protected double gpa;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        setGpa(gpa);
    }

    @Override
    public String toString() {
        return "Student: " + getID() + ". " + this.name + " " + this.surname;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public double getPaymentAmount() {
        if (getGpa() > 2.67) return 36660;
        else return 0;
    }
}
