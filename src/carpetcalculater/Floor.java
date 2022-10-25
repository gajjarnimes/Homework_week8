package carpetcalculater;

public class Floor {
    double width ,length; //instance variables
    public Floor(double width,double length){
        this.width=width;
        this.length=length;
    }
    public double gerArea(){
        if(width<0){
            this.width=0;
        }
        if(length<0){
            this.length=0;
        }
        double area=(width*length);
        return area;
    }
}
