public class ReverseStr {
    public static void main(String[] args){
        //1)Using + (string concatenation) operator
        String str="ABCD";
        String rev="";
        int len=str.length(); //4
        //position of string starts from index 0
        //len-1=>3
        /* 
        for(int i=len-1;i>=0;i--){
            //First loop
            //i=3
            //rev->null=null+charAt(3)=>D
            //rev=D

            //Second loop
            //i=2
            //rev->D=D+charAt(2)=>C
            //rev=DC

            //Third loop
            //i=1
            //rev->DC=DC+charAt(1)=>B
            //rev=DCB

            //4th loop
            //i=0
            //rev->DCB=DCB+charAt(0)=>A
            //rev=DCBA
            rev=rev+str.charAt(i);
        }
        System.out.println("Reversed String :"+rev);
    }
    */
    //2->Using Character Array
    //This will convert the string into the multiple parts of Array
    char a[]=str.toCharArray(); //[a,b,c,d]
    int leng=a.length;
    for(int i=leng-1;i>=0;i--){
        rev=rev+a[i];
    }
    System.out.println("Reversed String : "+ rev);

    //3.Using String Buffer Class
    StringBuffer sb=new StringBuffer(str);
    StringBuffer reversed=sb.reverse();
    System.out.println("Reveresed String from string Buffer"+reversed);

}
}
