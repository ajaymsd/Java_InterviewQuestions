public class RemoveWs {
    public static void main(String[] args){
        String str="Java      Programming selenium";
        str=str.replaceAll("\\s", "");
        System.out.println("After Removing Whitespaces" +str);
    }
}
