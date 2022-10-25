package week_8_Javawork;
import java.util.Scanner;
public class Point {
    int x,y;//instance variable
    public Point() {
    }
    public static void main(String[] args) {

     Point first = new Point(6,5);
     Point second = new Point(3,1);
     System.out.println("distance(0,0)="+first.distance(0,0));
     System.out.println("distance(second)="+first.distance(second));
     System.out.println("distance(2,2)="+ first.distance(2,2));
     Point point= new Point();
     // Point 2D point 2D= ;
     System.out.println("Distance()="+point.distance(0,0));
 }
    private Point(int x, int y){  //0 argument constructor
     this.x =x;
     this.y=y;
    }
    public int getX(){
     return x;
    }
    public int getY(){
     return y;
    }
    public void setX(int x){
     this.x = x;
    }public void setY(int y){
     this.y=y;
    }public double distance(){
     return distance(0 ,0 );
    }public double  distance(int x, int y){
        return Math.sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }
    public double distance(Point secondPoint){
     return distance( secondPoint.x, secondPoint.y);
    }





   }




