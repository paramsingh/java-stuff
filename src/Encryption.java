import java.util.Scanner;
public class Encryption {
    public static void main( String[] args ){
        //10181179401 --> 104 97 118 101 --> have
        Scanner in = new Scanner( System.in );
        System.out.println("Input the stuff");
        String input = in.nextLine();
        //looping variable
        int i = input.length()-1;
        //store the ascii value
        int ascii;
        //store the ascii value in a string temporarily
        String temp;
        while( i>0 ){
            char ch = input.charAt(i);
            if( ch=='1' ){
                //if ch is '1' then ascii value has 3 digits
                // so add the next two values to temp and decrease
                // the looping variable by 3;
                temp = ch+""+input.charAt(i-1)+""+input.charAt(i-2);
                i -= 3;
            }
            else {
                //if ch is not '1' then ascii value has 2 digits
                //so add the next value and decrease the looping
                //variable by 2
                temp = ch+""+input.charAt(i-1);
                i -= 2;
            }
            //convert temp to integer ascii value
            ascii = Integer.parseInt( temp );
            //typecast integer into a char and print it.
            System.out.print( (char)ascii );
        }
    }
}
