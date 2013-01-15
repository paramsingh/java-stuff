import java.util.Scanner;
public class Title {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the string");
        String userInput = in.nextLine();
        System.out.println(titleCaseOf(userInput));
    }
    public static String titleCaseOf( String sentence ){
        //Split the sentence into words
        String[] words = sentence.split(" ");
        //String to store the changed sentence
        String changedSen = "";
        for(String word : words){
            //changing the word to title case by converting first char to 
            //upper case and adding the rest of the string
            String titleWord = Character.toUpperCase(word.charAt(0))+ word.substring(1);
            
            changedSen += titleWord +" ";
        }
        return changedSen;
    }
}
