import java.io.*;
import java.util.Random;
public class Hangman {
    public static void main( String[] args )throws IOException{
        //objects for File IO
        FileReader fr = new FileReader("/home/param/Documents/java/enable1.txt");
        BufferedReader br = new BufferedReader( fr );
        //Objects for input from user
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        //get a random line number
        Random r = new Random();
        int lineNo = r.nextInt(172820);
        int count = 0;
        String randomWord="";
        //read the word at the random line number and store it in
        //randomWord
        String s;
        while( (s=br.readLine())!=null ){
            count++;
            if( count == lineNo ){
                //using substring to remove \n and \r from the string
                randomWord = s.substring(0,s.length()-2);
                break;
            }
        }
        //close the file IO objects
        br.close(); fr.close();
        //for debugging purposes
        System.out.println(randomWord);
        
        int len = randomWord.length();
        //using a character array instead of a string for easy replacement
        char[] usersGuess = new char[len];
        
        int i;//looping variable.
        //set all the values in the guess to _
        for(i=0;i<len;i++)
            usersGuess[i] = '_';
        boolean complete = false;
        int maxGuesses = 20;
        int numberOfGuesses = 0;
        String misses = "";
        while( !complete ){
            //increment the number of guesses
            numberOfGuesses ++;
            //print some stuff
            System.out.print("Guesses : ");print(usersGuess);
            System.out.println("Misses : "+misses);
            //input the users guess
            System.out.println("Enter your guess");
            char guess = in.readLine().charAt(0);
            if(randomWord.contains(guess+"")){
                //replace all positions of the correct guess with the character
                for( i=0;i<len;i++ ){
                    if( randomWord.charAt(i) == guess )
                        usersGuess[i] = guess;
                }
                System.out.println("Your guess was correct");
            }
            else{
                misses = misses + guess;
                System.out.println("Your guess was incorrect.");
            }
            //if the user has guessed all the characters
            if( convertToString(usersGuess).equals(randomWord) ){
                System.out.println("You guesses the word. It was "+ randomWord +".");
                complete = true;
            }
            //if the number of guesses are over
            if( numberOfGuesses == maxGuesses ){
                System.out.println("Your alloted guesses are over. The word was "+ randomWord+".");
                complete = true;
            }
        }
    }
    public static void print(char[] ch){
        //print a character array in the form of a string
        for(int i =0;i<ch.length;i++){
            System.out.print(ch[i]);
        }
        System.out.println();
    }
    public static String convertToString(char[] ch){
        //convert a character array into a string
        String str ="";
        for( int i=0;i<ch.length;i++ ){
            str = str+ch[i];
        }
        return str;
    }
}
