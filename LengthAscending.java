import java.util.Scanner;
public class LengthAscending {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        //input
        System.out.println("Enter the sentence.");
        String sentence = in.nextLine();
        
        //split the sentence into its words
        String[] words = sentence.split(" ");
        //looping variables
        int i,j;
        //number of words
        int len = words.length;
        //temporary variable for sorting
        String temp;
        //sort according to length
        for(i=0;i<len;i++){
            for(j=0;j<len;j++){
                if(words[i].length()<words[j].length()){
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        //print the sorted array
        for(i=0;i<len;i++){
            System.out.print(words[i]+" ");
        }
    }
}
