import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        Random ra=new Random();
        int num=ra.nextInt(1000000);
        double num1=ra.nextDouble();
        System.out.println(num);
        System.out.println(num1);

        //Using Apache Commons API
        //http://commons.apache.org//
    }
}
