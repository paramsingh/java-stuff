import java.util.Scanner;
public class Alphabetical {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the sentence");
        String userInput = in.nextLine();
        System.out.println("In alphabetical order : ");
        System.out.println(changeToAlphabetical(userInput));
    }
    static String changeToAlphabetical( String sentence ){
        
        //Splitting the sentence into its words
        String[] words = sentence.split(" ");
        
        //Now sort the array words using any sort algorithm
        int l = words.length;
        String temp;
        int i,j;
        for(i=0; i<l; i++){
            //Sorting needs to be done
            //wasn't working earlier
        }
        
        //Add the sorted string to another variable which
        //can be returned
        String alphabetical = "";
        for(String word: words){
            alphabetical += word + " ";
        }
        return alphabetical;
    }
}
