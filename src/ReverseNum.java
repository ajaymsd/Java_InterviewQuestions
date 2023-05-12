import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Number:");
        int num=sc.nextInt();

        //Method 1=>Using Algorithm

        int temp=0;
        /* 
        while(num!=0){
            //For debugging we can take 1234 as num 
            temp=temp*10+num%10; //0*10+1234%10=>0+4=>4
            num=num/10; 
            //1st loop
            //temp=0,num=1234
            //temp=>0=0*10+1234%10=>0+4
            //num=1234/10=>4 eliminates

            //2nd loop
            //temp=4,num=123
            //temp=>4=4*10+123%10=>40+3=>43
            //num=123/10=>12=>3 eliminates

            //3rd loop
            //temp=43,num=12
            //temp=>43*10+12%10=>430+2=>432
            //num=12/10=>2 eliminates

            //4th loop
            //temp=432,num=1
            //temp=>432*10+1%10=>4230+1=>4231
            //num=1/10=>1 eliminates there is no remaining number
            
        }
        System.out.println("Reversed Number is:" +temp);
        */
        /* 
        //Method 2=>Using string buffer class
        //Declaring the StringBuffer Variable
        StringBuffer rev;
        //Converting a number to String using string buffer
        StringBuffer sb=new StringBuffer(String.valueOf(num));
        //reversing the string using reverse method
        rev=sb.reverse();
        System.out.println("Reversed String :"+rev);
        */

        //Method 3=>Using string builder class
        StringBuilder sb=new StringBuilder();
        StringBuilder rev;
        //Appends the num
        sb.append(num);
        rev=sb.reverse();
        System.out.println("Reversed Sting using String Builder class:"+rev);


    }
}
