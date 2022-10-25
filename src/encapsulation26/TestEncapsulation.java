package encapsulation26;

import static encapsulation26.Encapsulate.obj;

public class TestEncapsulation {
    public static void main(String[] args) {
        obj =new Encapsulate();
        //setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollno(51);
        // Displaying values of the variables
        System.out.println("Prime's name:"+ obj.getName());
        System.out.println("Prime's age:"+ obj.getAge);
        System.out.println("Prime's rollNo:"+ obj.getRollNo());
        // Direct access of rollNo is not possible due to encapsulation
        //System.out.prinln("Prime's rollNo:"+obj.geeknam);
    }
}

