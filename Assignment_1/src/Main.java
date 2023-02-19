import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Point> points = Assignment2.readPoints("file1.txt");
        System.out.println("List of all points:");
        for(Point point:points){
            System.out.println("Point "+ (points.indexOf(point)+1) + ": x="+point.getX()+" y="+point.getY());
        }
        Shape shape = new Shape(Assignment2.readPoints("file2.txt"));
        System.out.println("Perimeter: "+shape.calculatePerimeter());
        System.out.println("Longest side: "+shape.longestSide());
        System.out.println("Average length of sides: "+shape.averageSizeOfSides());
    }
}