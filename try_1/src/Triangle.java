public class Triangle {
    private static int id_gen = 0;
    private final int id;
    private double a, b, c;

    public Triangle() {
        id = id_gen++;
    }
    public Triangle(double a, double b, double c){
        this();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getId() {
        return id;
    }

    public void setLength(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getPerimeter() {
        return a + b + c;
    }

    public double getArea() {
        double peri = getPerimeter();
        return Math.sqrt((peri / 2) * ((peri / 2) - a) * ((peri / 2) - b) * ((peri / 2) - c));
    }
}
