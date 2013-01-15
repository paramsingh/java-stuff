import java.util.Scanner;
class ConsecutiveVowels {
    public static void main( String[] args) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a string");
        String userInput = in.nextLine();
        printConsecutiveVowels(userInput);
    }
    public static void printConsecutiveVowels( String s ){
        /** Print all the consecutive pair vowels in the parameter */
        int i;
        for(i=0;i< s.length()-1; i++){
            if( isVowel(s.charAt(i)) && isVowel(s.charAt(i+1)) ){
                System.out.println(s.charAt(i)+""+s.charAt(i+1));
            }
        }
    }
    static boolean isVowel(char ch){
        /** Check if the parameter is a vowel or not */
        return "AEIOUaeiou".contains(ch+"");
    }
}
