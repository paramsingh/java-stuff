import java.util.Scanner;
public class Vowels {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the string.");
        String input = in.nextLine();
        input = input.toUpperCase();
        int len = input.length();
        int i,j;
        int count = 0;
        String vowels = "AEIOU";
        int freq[][] = new int[5][5];
        for( i=0;i<len-1;i++){
            char ch = input.charAt(i);
            char next = input.charAt(i+1);
            if( isVowel(ch) && isVowel(next) ){
                count ++;
                System.out.println("Pair "+count+" is "+ch+","+next);
                freq[vowels.indexOf(ch)][vowels.indexOf(next)]++;
            }
        }
        System.out.println(" \tA\tE\tI\tO\tU");
        for( i=0;i<5;i++ ){
            System.out.print(vowels.charAt(i)+"\t");
            for(j=0;j<5;j++)
                System.out.print(freq[i][j]+"\t");
            System.out.println();
        }
    }
    static boolean isVowel( char ch ){
        return "AEIOU".contains(ch+"");
    }
}
