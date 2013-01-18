import java.util.Scanner;
public class Vowels {
    /*
     * Enter the string.
     * Computer Science is good for career
     * Pair 1 is I,E
     * Pair 2 is O,O
     * Pair 3 is E,E
     *  	A	E	I	O	U
     * A	0	0	0	0	0	
     * E	0	1	0	0	0	
     * I	0	1	0	0	0	
     * O	0	0	0	1	0	
     * U	0	0	0	0	0	
     */ 
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        //input
        System.out.println("Enter the string.");
        String input = in.nextLine();
        input = input.toUpperCase();
        //find the length of input
        int len = input.length();
        //variables for looping and stuff
        int i,j;
        //variable to keep count of the pairs of vowels
        int count = 0;
        //String of all possible vowels
        String vowels = "AEIOU";
        //frequency matrix to store frequency of each pair
        int freq[][] = new int[5][5];
        for( i=0;i<len-1;i++){
            char ch = input.charAt(i);
            char next = input.charAt(i+1);
            if( isVowel(ch) && isVowel(next) ){
                //increment count of pairs and then print
                //appropriate message
                count ++;
                System.out.println("Pair "+count+" is "+ch+","+next);
                //increment value in required index of freq
                //for example: if the pair is A,A ie. ch = A and next = A
                //then freq["AEIOU".indexOf('A')]["AEIOU".indexOf('A')] i.e freq[0][0]
                //will be incremented
                freq[vowels.indexOf(ch)][vowels.indexOf(next)]++;
            }
        }
        //printing
        System.out.println(" \tA\tE\tI\tO\tU");
        for( i=0;i<5;i++ ){
            System.out.print(vowels.charAt(i)+"\t");
            for(j=0;j<5;j++)
                System.out.print(freq[i][j]+"\t");
            System.out.println();
        }
    }
    static boolean isVowel( char ch ){
        //return true or false depending on whether the character is a
        //vowel.
        return "AEIOU".contains(ch+"");
    }
}
