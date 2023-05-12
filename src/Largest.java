import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        //Using Ternary operator
        int largest1=a>b?a:b;
        int largest2=c>largest1?c:largest1;

        System.out.println(largest2 +" is a greatest number");

    }
}
