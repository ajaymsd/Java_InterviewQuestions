import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int num=sc.nextInt();
       int org_num=num;
       int temp=0;
       while(num!=0){
        temp=temp*10+num%10;
        num=num/10;
       } 
      
       System.out.println(temp);
       
       if(org_num==temp){
        System.out.println("Yes" +org_num +"is a Palindrome");
       }else{
        System.out.println("Not a palindrome");
       }
    }
}
