import java.util.Scanner;
public class Alphabetical {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter the word." );
        String word = in.nextLine();
        if( inAlphabeticalOrder(word) )
            System.out.println("In alphabetical order.");
        else
            System.out.println("Not in alphabetical order.");
    }
    public static boolean inAlphabeticalOrder( String word ) {
        //check if the alphabets in the parameter are in alphabetical
        //order.
        word = word.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int i, len = word.length();
        for( i=0;i<len-1;i++ ){
            char ch = word.charAt(i);
            char next = word.charAt(i+1);
            //check if position of ch in alphabet is greater than
            //position of next in alphabet
            if( alphabet.indexOf(ch) > alphabet.indexOf(next) )
                return false;
        }
        return true;
    }
}
