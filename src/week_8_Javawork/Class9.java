package week_8_Javawork;

//Fibonacci Series: 1,1,2,3,5,8,13,21,34,55,89
public class Class9 {
    public static void main(String[] args) {
         int a=0;
         int b=1;
         int c;
         for(int i=0; i<=11; i++){
             System.out.println(a);
             c=a+b;
             a=b;
             b=c;



        }
    }
}

