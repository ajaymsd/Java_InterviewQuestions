import java.util.Scanner;

public class Checkevenandodd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number");
        int num=sc.nextInt();
        int count_odd=0;
        int count_even=0;
        while(num>0){
            int rem=num%10;
            if(rem%2==0){
              count_even++;
            }else{
                count_odd++;
            }
            num=num/10;
        }
        System.out.println("Count of Even numbers:"+count_even);
        System.out.println("Count of odd numbers:"+count_odd);

    }
}
