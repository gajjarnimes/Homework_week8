package cylinder;

public class Cylinder extends Circle {

    double height;
    public Cylinder(double radius, double height){
        super(radius);
        if(height<0){
            this.height = 0;
        }else {
            this.height=height;}
        }
        public double getHeight() {
            return this.height = height;
        }
        public double getVolume(){
        double volume =(getArea()*this.height);
        return volume;

    }

}
