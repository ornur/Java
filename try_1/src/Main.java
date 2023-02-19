import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle triangle = new Triangle();
        System.out.println("Enter the sides of triangle");
        double a = scanner.nextFloat();
        double b = scanner.nextFloat();
        double c = scanner.nextFloat();
        triangle.setLength(a, b, c);
        System.out.println("Perimeter of triangle is: " + triangle.getPerimeter());
        System.out.println("Area of triangle is: " + triangle.getArea());

    }

}
