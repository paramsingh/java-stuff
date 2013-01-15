import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a sentence.");
        String userInput = in.nextLine();
        System.out.println("When reversed at own place : ");    
        System.out.println(reverseAtPlace(userInput));
        System.out.println("When reversed wordwise : ");
        System.out.println(reverseWordWise(userInput));
    }
    static String reverseText(String s){
        /**
         * reverse the string and return it.
         */
        
        //Creating a StringBuffer object.
        StringBuffer buffer = new StringBuffer(s);
        return buffer.reverse().toString();
    }
    static String reverseAtPlace(String input){
        /**
         * reverse each and every word of the parameter at its own place
         */
         
        //Split the string into its words
        String[] words = input.split(" ");
        
        //String to contain the reversed input.
        String reversed = "";
        
        for(String word : words){
            //using method reverseText to reverse each word and add it
            //to the reversed
            reversed += reverseText(word) + " ";
        }
        
        //returning the string which contained the reversed string
        return reversed;
    }
    static String reverseWordWise(String sentence){
        /**
         * reverse the sentence word wise and return it
         * For Example:
         * Input : Hello this is dog
         * Output: dog is this Hello
         */
        
        //Split the string into its words
        String[] words = sentence.split(" ");
         
        //String to contain the reversed input.
        String reversed = "";
         
        //Number of words in the sentence
        int numWords = words.length;
         
        //looping variable
        int i;
         
        for(i = numWords - 1; i>=0; i--){
            //looping through the array in reverse order & adding each
            //word to the string "reversed"
            reversed = reversed + words[i] + " ";
        }
        return reversed;
    }
}
