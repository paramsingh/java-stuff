import java.util.Scanner;
public class WordsToNumber {
    //Nine-thousand nine-hundred ninety-nine
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        while( true ){
            System.out.println("Enter the string");
            String words = in.nextLine();
            int val = toNumber( words );
            if( val!=0 )
                System.out.println(val);
            else
                System.out.println("Invalid number");
            System.out.println("Try again(y/n) :");
            boolean try_again = in.nextLine().equalsIgnoreCase("y");
            if( !try_again )
                break;
        }
        System.out.println("Ok bye.");
    }
    public static int toNumber( String words ){
        String wordList[] = words.split(" ");
        int i, len = wordList.length;
        int[] digit_units = {0,1,2,3,4,5,6,7,8,9,10,11,
                             12,13,14,15,16,17,18,19};
        String[] word_units = {"Zero","One","Two","Three","Four","Five",
                            "Six","Seven","Eight","Nine","Ten","Eleven",
                            "Twelve","Thirteen","Fourteen","Fifteen",
                           "Sixteen","Seventeen","Eighteen","Nineteen"};
        int[] digit_tens = {0,0,20,30,40,50,60,70,80,90};
        String[] word_tens = {"","","Twenty","Thirty","Forty","Fifty",
                              "Sixty","Seventy","Eighty","Ninety"};
        String thou = "thousand", hundred = "hundred";
        int val = 0;
        for( i=0;i<len;i++ ){
            if( wordList[i].split("-").length==2 ){
                String pre = wordList[i].split("-")[0];
                String post = wordList[i].split("-")[1];
                if( post.equalsIgnoreCase(thou) ){
                    val += digit_units[find(word_units, pre)]*1000;
                }
                else if( post.equalsIgnoreCase(hundred) ){
                    val += digit_units[find(word_units,pre)]*100;
                }
                else if( find(word_units,post)!=-1 ){
                    val += digit_tens[find(word_tens, pre)]+
                           digit_units[ find(word_units, post) ];
                } 
            }
            else{
                int pos_unit = find(word_units, wordList[i]);
                int pos_tens = find(word_tens, wordList[i] );
                if( pos_unit!=-1)
                    val += digit_units[pos_unit];
                else if( pos_tens!=-1)
                    val += digit_tens[pos_tens];
            }
        }
        return val;
    }
    public static int find( String[] a, String s){
        //find the position of s in a
        //return -1 if s isn't present in a 
        for( int i = 0; i< a.length; i++){
            if(s.equalsIgnoreCase(a[i]))
                return i;
        }
        return -1;
    }
}
