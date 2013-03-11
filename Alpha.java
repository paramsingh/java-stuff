// http://www.respaper.com/isc/552/674.pdf
// Question 9

import java.util.Scanner;
public class Alpha {
    String str;
    Alpha() {
        //default constructor
        str = "";
    }
    void readword() {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the word");
        str = in.nextLine();
    }
    void arrange() {
        String arranged = "";
        str = str.toLowerCase();
        // compare a-z with each character of the string
        // and add it to arranged if it's present in the string
        for( char c = 'a'; c <= 'z'; c++ ){
            for( int i = 0; i<str.length(); i++){
                if( str.charAt(i) == c )
                    arranged += c;
            }
        }
        //put the value of arranged in str
        str = arranged;
    }
    void disp(){
        System.out.println(str);
    }
    public static void main( String[] args ){
        Alpha ob = new Alpha();
        ob.readword();
        System.out.print( "Original : ");
        ob.disp();
        
        ob.arrange();
        
        System.out.print("Arranged : ");
        ob.disp();
    }
}
