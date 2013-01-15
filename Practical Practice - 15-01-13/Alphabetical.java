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
        for(int i=0; i<l; i++){
            for(j=i+1; j<l; j++){
                if( words[i].compareTo(words[j]) > 0 ){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        //Add the sorted string to another variable which
        //can be returned
        String alphabetical = "";
        for(String word: words){
            alphabetical += word + " ";
        }
        return alphabetical;
    }
