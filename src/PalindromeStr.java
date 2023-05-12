import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String org_str=s;

        int strlg=s.length();
        String revstr="";
        for(int i=strlg-1;i>=0;i--){
             revstr=revstr+s.charAt(i);
        }
        System.out.println(revstr);
        if(org_str.equals(revstr)){
            System.out.println("Given string is palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
