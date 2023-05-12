public class starPattern {
    public static void main(String[] args){
        //1st Pattern
        /* 
        for(int row=1;row<=5;row++){
            for (int col=1;col<=row;col++){
               System.out.print("*");

            }
            System.out.println();
        }
        */
        for(int row=1;row<=5;row++){
            for(int col=row;col>=1;col--){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
