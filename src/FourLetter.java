//http://redd.it/149kec
import java.io.*;
public class FourLetter {
    public static void main( String[] args ) throws Exception {
        //File IO
        FileReader fr = new FileReader("/home/param/Documents/java/fourletter.txt");
        BufferedReader br = new BufferedReader( fr );
        String content = "";
        String s;
        while( (s=br.readLine())!=null ){
            content += s+" ";
        }
        String[] words = content.split(" ");
        br.close(); fr.close();
        //get input from user
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println("Enter the first word.");
        String input = in.readLine();
        //find difference for each word and print accordingly.
        for( int i=0;i<words.length;i++ ){
            if( diff(input, words[i])==1 ){
                System.out.println(words[i]);
            }
        }
    }
    public static int diff( String word1, String word2 ){
        if( word1.length()!=4 || word2.length()!=4 )
            return -1;
        int diff = 0;
        for( int i=0;i<4;i++ ){
            if( word1.charAt(i) != word2.charAt(i) )
                diff++;
        }
        return diff;
    }
}
