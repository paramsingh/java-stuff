import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class CircularRemoval
{
    public static void main( String[] args )throws IOException
    {
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader in = new BufferedReader( isr );
        System.out.println("Please enter the string.");
        String sentence = in.readLine()+" ";
        System.out.println("Please enter the number.");
        int num = Integer.parseInt( in.readLine() );
        String[] words = sentence.split(" ");
        if( num > words.length )
        {
            System.out.println("Invalid number. Greater than number of words.");
            System.exit(0);
        }
        int counter=1, numberOfWords = words.length, wordsLeft = words.length, i;
        while( wordsLeft>1 )
        {
            for( i=0;i<numberOfWords;i++ )
            {
                if(words[i].equals(""))
                {
                    continue;
                }
                else
                {
                    if(counter==num)
                    {
                        words[i]="";
                        wordsLeft--;
                        counter=1;
                    }
                    else
                    {
                        counter++;
                    }
                }
            }
        }
        for( String s : words )
        {
            System.out.print(s);
        }
    }
}
