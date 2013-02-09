import java.util.Scanner;
public class Frequency {
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the sentence.");
        String input = in.nextLine().toUpperCase();
        int i, len = input.length();
        for( i=0;i<len;i++ ){
            char ch = input.charAt(i);
            int freq = findFreq( input, ch );
            if(input.indexOf(ch)==i )
                System.out.println("Frequency of "+ch+" is "+freq);
        }
    }
    public static int findFreq(String s, char ch){
        int freq = 0;
        for( int i=0;i<s.length();i++ ){
            if( ch==s.charAt(i) ){
                freq ++;
            }
        }
        return freq;
    }
}
