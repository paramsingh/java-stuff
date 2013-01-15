import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a sentence.");
        String userinput = in.nextLine();
        System.out.println(reverseAtPlace(userinput));
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
        
        /**String to contain the reversed word*/
        String reversed = "";
        
        for(String word : words){
            //using method reverseText to reverse each word and add it
            //to the reversed
            reversed += reverseText(word) + " ";
        }
        
        return reversed;
    }
}
