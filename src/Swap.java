public class Swap{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println("Before Swapping the values"+a+" "+b);

        //LOGIC 1=>USING THE THIRD VARIABLE
       /*
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping the values Using Third Variable a and b is :"+a+" "+b);
        */

        //LOGIC 2=>WITHOUT USING THIRD VARIABLE
        /* 
        a=a+b; //10+20=30
        b=a-b; //30-20=10
        a=a-b; //30-10=20
        System.out.println("After Swapping the values Without Using Third Variable a and b is :"+a+" "+b);
        */
        //LOGIC 3=>USING * & / WITHOUT USING THIRD VARIABLE
        //THE VALUES SHOULD BE NON ZEROS
        /* 
        a=a*b; //10*20=200
        b=a/b; //200/20=10
        a=a/b; //200/10=20
        System.out.println("After Swapping the values Without Using Third Variable a and b is :"+a+" "+b);
        */

        //logic 4=>using bitwise XOR(^)
        a=a^b; 
        b=a^b;
        a=a^b;
        System.out.println("After Swapping the values Without Using Third Variable a and b with bitwise operator is :"+a+" "+b);

        //logic 5=>Single statement
        b=a+b-(a=b); //execution will start from right to left
        System.out.println("After Swapping the values Without Using Third Variable a and b with single statement is :"+a+" "+b);

    }
}