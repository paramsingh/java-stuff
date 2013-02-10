import java.util.Scanner;
public class WordAlphabetical {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in ) ;
        System.out.println("Enter the sentence.");
        String sentence = in.nextLine().toUpperCase();
        String[] words = sentence.split(" ");
        for( int i=0;i<words.length;i++){
            for( int j=0;j<words.length;j++){
                if( words[i].compareTo(words[j])<1 ){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        for( int i = 0;i<words.length;i++)
            System.out.print(words[i]+" ");
    }
}        
