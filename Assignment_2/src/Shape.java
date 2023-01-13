import java.util.ArrayList;
import java.util.List;

public class Shape {
    private final List<Point> points;

    public Shape(List<Point> points){
        this.points=new ArrayList<>();
        for(Point point:points){
            addPoint(point);
        }
    }
    public void addPoint(Point point){
        points.add(point);
    }
    public List<Point> getPoints(){
        return points;
    }
    public double calculatePerimeter(){
        double perimeter=0;
        for(int i=0; i<points.size()-1; i++){
            perimeter+=points.get(i).distance(points.get(i+1));
        }
        if (points.size() > 2){
            perimeter+=points.get(0).distance(points.get(points.size() - 1));

        }
        return perimeter;
    }
    public double longestSide(){
        double longest =-1;
        for(int i=0; i<points.size()-1; i++){
            if(points.get(i).distance(points.get(i+1))>longest){
                longest = points.get(i).distance(points.get(i+1));
            }
        }
        return longest;
    }
    public double averageSizeOfSides(){
        return calculatePerimeter()/points.size();
    }
}
