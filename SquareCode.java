/*
 * One classic method for composing secret messages is called a square code.  The spaces
 * are removed from the english text and the characters are written into a square (or
 * rectangle).  For example, the sentence "If man was meant to stay on the ground god would
 * have given us roots" is 54 characters long, so it is written into a rectangle with 7
 * rows and 8 columns.
 *
 *              ifmanwas
 *              meanttos
 *              tayonthe
 *              groundgo
 *              dwouldha
 *              vegivenu
 *              sroots
 *
 * The coded message is obtained by reading down the columns going left to right.   For
 *  example, the message above is coded as:
 * imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn  sseoau
 * In your program, have the user enter a message in english with no spaces between the
 * words.  Have the maximum message length be 81 characters.  Display the encoded message
 * . (Watch out that no "garbage" characters are printed.)    Here are some more examples:
 * Input                                           Output
 * haveaniceday                                    hae and via ecy
 * feedthedog                                      fto ehg ee  dd
 * chillout                                        clu hlt io
 *
 */

import java.io.*;
public class SquareCode
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println("Enter the message to be encoded WITHOUT spaces");
        String input = in.readLine();
        int length = input.length();
        int dimensions[] = returnDimensions(length);

    }
    public static int[] returnDimensions(int n)
    {
        int i;
        if((int)(Math.sqrt(n)*Math.sqrt(n))==n)
            return {(int)Math.sqrt(n),(int)Math.sqrt(n));
        for(i=2;i<n;i++)
        {
            if( n%i==0 && i<n/i )
