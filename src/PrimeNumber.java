import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number to check");
        int num=sc.nextInt();
        int count=0;
        //Entering into program only whether the num is greater than 1
        if(num>1){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    count++;
                }
            }
            //Here we are checking whether the number is having only two divisors
                if(count==2){
                    System.out.println("Yes it is a prime Number");
                }else{
                    System.out.println("Not a prime number");
                }

            
        }else{
            System.out.println("Not a Prime Number");
        }
    }
}
