import java.io.*;
public class Anagrams {
    public static void main( String[] args ) throws Exception {
        FileReader fr = new FileReader("/home/param/Documents/java/enable1.txt");
        BufferedReader br = new BufferedReader( fr );
        String content = "";
        boolean eof=false;
        while(!eof){
            try{
                content=br.readLine()+" ";
            }
            catch(EOFException e){
                eof=true;
            }
        }
        String words[] = content.split(" ");
    }
    public static boolean isAnagram(String a, String b){
        a = a.toUpperCase();
        b = b.toUpperCase();
        for( char c ='A'; c<='Z';c++)
        
