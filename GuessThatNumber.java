import java.util.Scanner;
public class GuessThatNumber {
    /*
     * The problem:
     * http://www.reddit.com/r/dailyprogrammer/comments/15ul7q/122013_challenge_115_easy_guessthatnumber_game/
     */ 
    public static void main( String[] args) {
        guessThatNumber();
    }
    public static void guessThatNumber(){
        Scanner in = new Scanner( System.in );
        //choosing a random number between 1 to 100
        int number = (int)(Math.random()*100);
        //output for user
        System.out.println("I have chosen a number between 1 to 100. Try to guess it.");
        System.out.println("Enter \"exit\" to exit");
        System.out.println("Good luck.");
        //number of turns taken by the user
        int turns = 0;
        //variable to store whether user exits or guesses correctly
        boolean exit = false;
        while(true){
            String input = in.nextLine();
            if(input.equalsIgnoreCase("exit")){
                exit = true;
                break;
            }
            else {
                turns ++;
                int guess = Integer.parseInt(input);
                if( guess == number)
                    break;
                else if( guess < number )
                    System.out.println("A little bigger");
                else
                    System.out.println("Lower");
            }
        }
        if(exit){
            System.out.println("You gave up. :(");
            System.out.println("The number I was looking for was "+number+".");
        }
        else {
            System.out.println("Congratulations! You guessed correctly. :D");
            System.out.println("You took "+turns+" turns to guess the number.");
        }
    }
}
