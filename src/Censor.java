import java.io.*;
import java.util.Scanner;
public class Censor {
    public static void main( String[] args )throws Exception{
        FileReader fr = new FileReader("/home/param/Documents/java/badwords/badwords.txt");
        BufferedReader br = new BufferedReader( fr );
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the text to be censored.");
        String text = in.nextLine();
        String words[] = text.split(" ");
        for( int i=0;i<words.length;i++ ){
        System.out.println(text);
    }
    public static String censor(String text, String word){
        //text is the sentence which needs to be censored
        
    }
}
