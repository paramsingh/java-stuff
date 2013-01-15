import java.util.Scanner;
public class Unique {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the sentence");
        String userInput = in.nextLine();
        //Split user's sentence into its words
        String[] words = userInput.split(" ");
        
        System.out.println("Unique words are");
        
        //Iterating through the array and checking if word is unique
        //or not.
        for(String word : words ){
            if(isUnique(word))
                System.out.println(word);
        }
    }
    public static boolean isUnique( String word ){
        /** Check if the parameter is a unique word or not. */
        //number of characters in the word
        int len = word.length();
        //looping variables
        int i,j;
        //variable to count the frequency of characters
        int freq = 0;
        for(i=0;i<len;i++){
            freq = 0;
            char ch = word.charAt(i);
            //calculating the frequency of ch in the word
            for(j=0;j<len;j++){
                if( word.charAt(j) == ch )
                    freq++;
            }
            //if frequency is greater than one, the word is not unique
            if(freq>1)
                return false;
        }
        return true;
    }
}
