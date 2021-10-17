 import java.util.Scanner;

class SignCheck{

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number :");
        int num1 =sc.nextInt();
        System.out.println("Enter second number :");
        int num2 =sc.nextInt();
        if((num1>0 && num2>0)||(num1<0 && num2<0))
        System.out.println("Equal Sign");
        else
        System.out.println("Opposite Sign");
    }
}