import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private double x;
    private double y;

    public Point(){

    }
    public  Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y  = y;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double distance(Point anotherPoint){
        return (sqrt(pow(getX()-anotherPoint.getX(), 2)+pow(getY()- anotherPoint.getY(), 2)));
    }
}
