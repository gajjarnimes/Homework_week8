package cylinder;

public class Circle {
    double radius;//instance variable
    public Circle(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        if (radius<0){
            return radius;
        }else {
            return radius;
        }
    }
    public double getArea(){
        double area =(Math.PI*radius*radius);
        return area;
    }
}
