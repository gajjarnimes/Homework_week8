package week_8_Javawork;


import java.util.Scanner;

public class MinandMaxInputChallenge {
    private static int i;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Number");
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        while (i==1);
        if(a>b){
            System.out.println("Between%d and %d,maximum is %d %n,a,b,a");
        }else{
            System.out.println("Between%d and %d,maximum is %d %n,a,b,b");
        }
        int max =Math.max(a,b);
        System.out.println("Maximum value of %dand %d using Math.max() is %d%n,a,b,max");
        // calculating minimum number
        System.out.println("please enter number");
        int x= scanner.nextInt();
        int y=scanner.nextInt();
        if(x<y){
            System.out.println("Between %d and %d Minimum number is %d%n,x,y,x");
        }else {
            System.out.println("Between %d and %d Minimum number is %d%n,x,y,y");
        }
        int min= Math.min(x,y);
        System.out.println("Maximum value of %dand %d using Math.max() is %d%n,x,y,min");
        scanner.close();

    }








        }


