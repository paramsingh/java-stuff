import java.io.*;
public class Kmap {
    public static void main ( String[] args )throws Exception{
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader in = new BufferedReader( isr );
        System.out.println("Enter 1 for SOP, 2 for POS");
        int map[][] = new int[4][4];
        int x = Integer.parseInt(in.readLine());
        if( x == 2 ){
            x = 0;
            for(int i=0;i<4;i++ ){
                for(int j=0;j<4;j++ )
                    map[i][j]=1;
            }
        }
        int vals[][] ={{0,1,3,2},{4,5,7,6},{12,13,15,14},{8,9,11,10}};
        System.out.println("Enter the function");
        String s = in.readLine();
        String[] function = s.split(",");
        for( int i=0;i<function.length;i++ ){
            int a = Integer.parseInt(function[i]);
            int pos[] = find(vals, a);
            map[pos[0]][pos[1]] = x;
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
                System.out.print(map[i][j]+"|");
            System.out.println();
            System.out.println("--------");
        }
    }
    public static int[] find(int[][] array, int a){
        int pos[] = new int[2];
        for( int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if( array[i][j]==a ){
                    pos[0]=i;
                    pos[1]=j;
                    return pos;
                }
            }
        }
        return null;
    }
}
