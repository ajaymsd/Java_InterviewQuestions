import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDa {
    public static void main(String[] args) throws IOException{
        FileWriter fw=new FileWriter("D:\\VS-Code for Java\\Test.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        bw.write("Priynaka Mohan");
        System.out.println("Writing to file finished");
        bw.close();
        
    }
}
