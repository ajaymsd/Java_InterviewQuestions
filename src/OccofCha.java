public class OccofCha{
    public static void main(String[] args){
        String s="JavA is a programming language java java";
        int totalcount=s.length(); //totallength
        int totalcount_after_remove=s.replaceAll("a", "").length();
        int total=totalcount-totalcount_after_remove;
        System.out.println("Number of occurences for A: "+total);
        
    }
}