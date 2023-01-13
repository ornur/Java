import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Assignment2 {
    public static List<Point> readPoints(String filename){
        List<Point> pointList = new ArrayList<>();
        File file = new File(filename);
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                double x=scanner.nextDouble();
                double y=scanner.nextDouble();
                Point point= new Point();
                point.setX(x);
                point.setY(y);
                pointList.add(point);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File "+filename+" does not exist");
            throw new RuntimeException(e);
        }
        return pointList;
    }
}
