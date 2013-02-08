import java.io.*;
import java.util.Scanner;
public class Censor {
    public static void main( String[] args )throws Exception{
        FileReader fr = new FileReader("/home/param/Documents/java/badwords/badwords.txt");
        BufferedReader br = new BufferedReader( fr );
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the text to be censored.");
        String text = in.nextLine();
        String s;
        while( (s=br.readLine())!=null ){
            censor( text, s );
        }
        System.out.println(text);
    }
    public static void censor(String text, String word){
        
    }
}
