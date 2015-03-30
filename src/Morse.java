import java.util.Scanner;
public class Morse {
    static final String characters = "abcdefghijklmnopqrstuvwxyz1234567890,. ";
    static final String[] morsecode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
                ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--",
                "--..", ".----", "..---", "...--", "....-", ".....", "-....",
                "--...", "---..", "----.", "-----", ".-.-.-", "--..--", ""};
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the string to be converted into morse.");
        String input = in.nextLine();
        System.out.println(toMorse(input));
        System.out.println("Enter morse code");
        input = in.nextLine();
        System.out.println( fromMorse(input) );
    }
    public static String toMorse( String s ){
        int i, len = s.length();
        String morse = "";
        for( i=0;i<len;i++ ){
            char ch = s.charAt(i);
            morse += morsecode[ characters.indexOf(ch) ] +" ";
        }
        return morse;
    }
    public static String fromMorse(String morse){
        String normal = "";
        String[] words = morse.split("  ");
        int i,j;
        for( i=0;i<words.length;i++ ){
            String[] chars = words[i].split(" ");
            for(j=0;j<chars.length;j++){
                normal += characters.charAt( find(chars[j]) );
            }
            normal += " ";
        }
        return normal;
    }
    public static int find( String s ){
        for( int i = 0;i<morsecode.length;i++){
            if( s.equals(morsecode[i]) ){
                return i;
            }
        }
        return -1;
    }
}
