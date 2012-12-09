/*
 *  In the game of chess, a queen can attack pieces which are on the same row, column, or
 *  diagonal. A chessboard can be represented by an 8 by 8 array. A 1 in the array
 *  represents a queen on the corresponding square, and a O in the array represents an
 *  unoccupied square. Your program is to read the location of two queens and then update
 *  the array appropriately.  Then process the board and indicate whether or not the two
 *  queens are positioned so that they attack each other.
 */

import java.io.*;

public class Chess
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int board[][] = new int[8][8];
        System.out.println("Please enter the position of the white queen");
        String poswhite = in.readLine();
        System.out.println("Please enter the position of the black queen");
        String posblack = in.readLine();

        String indexForAlphabets = "abcdefgh";
        String indexForNumbers = "87654321";

        //updating board for position of white queen
        char whiterow,whitecol;
        whiterow=poswhite.charAt(0);
        whitecol=poswhite.charAt(poswhite.length()-1);
        int windexrow= indexForAlphabets.indexOf(whiterow);
        int windexcol= indexForNumbers.indexOf(whitecol);
        board[windexcol][windexrow]=1;

        //updating board for position of black queen
        char blackrow,blackcol;
        blackrow=posblack.charAt(0);
        blackcol=posblack.charAt(posblack.length()-1);
        int bindexrow= indexForAlphabets.indexOf(blackrow);
        int bindexcol = indexForNumbers.indexOf(blackcol);
        board[bindexcol][bindexrow] = 1;

        System.out.println("The board:");
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                System.out.print(board[i][j]+" ");
            System.out.println();
        }
        System.out.println();

        boolean canAttack= isAttackPossible(board);
        if(canAttack)
            System.out.println("The queens can attack each other");
        else
            System.out.println("The queens can't attack each other");
    }

    public static boolean isAttackPossible(int board[][])
    {
        int dupboard[][] = board;
        int i,j,col1=0,row1=0,col2=0,row2=0,count=0;
        for(i=0;i<8;i++)
        {
            for(j=0;j<8;j++)
            {
                if( board[i][j]==1 && count==0 )
                {
                    col1=i;row1=j;count++;
                }
                else if(board[i][j]==1 && count!=0)
                {
                    col2=i;row2=j;
                }
            }
        }
        dupboard[col2][row2]=0;

        //updating places where first queen can attack to 1
        i=col1;j=row1;
        while(i>=0 && j<8)
            dupboard[i--][j++]=1;//going diagonally up and right

        i=col1;j=row1;
        while(i<8 && j>=0)
            dupboard[i++][j--]=1;//going diagonally down and left

        i=col1;j=row1;
        while(j>=0)
            dupboard[i][j--]=1;//going left

        i=col1;j=row1;
        while(j<8)
            dupboard[i][j++]=1;//going right

        i=col1;j=row1;
        while(i>=0)
            dupboard[i--][j]=1;//going up

        i=col1;j=row1;
        while(i<8)
            dupboard[i++][j]=1;//going down

        i=col1;j=row1;
        while(i>=0 && j>=0)
            dupboard[i--][j--]=1;//going diagonally up and left

        i=col1;j=row1;
        while(i<8 && j<8)
            dupboard[i++][j++]=1;//going diagonally down and right

        dupboard[col1][row1]=2;
        System.out.println("Ways in which queen can attack");
        for(i=0;i<8;i++){
            for(j=0;j<8;j++)
                System.out.print(dupboard[i][j]+" ");
            System.out.println();
        }
        System.out.println();

        return dupboard[col2][row2]==1;
    }
}
