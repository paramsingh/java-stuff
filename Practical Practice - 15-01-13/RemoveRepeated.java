import java.util.Scanner;
public class RemoveRepeated {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String userInput = in.nextLine();
        System.out.println("String after repeated characters are removed : ");
        System.out.println(removeRepeated(userInput));
    }
    public static String removeRepeated( String word ){
        /** Remove all the characters that are repeated in the parameter
         * For example : 
         * Input : ABBBA
         * Output: AB
         */ 
        //looping variable
        int i;
        //length of the word
        int len = word.length();
        //String to store the changed word
        String removed = "";
        for(i=0;i<len;i++){
            /*
             * if the string removed already contains the character,
             * then it doesn't need to be added. So first check if the
             * character is present in the string already. If it isn't
             * add it to the string.
             */ 
            if( !removed.contains(word.charAt(i)+"") )
                removed += word.charAt(i);
        }
        return removed;
    }
}
