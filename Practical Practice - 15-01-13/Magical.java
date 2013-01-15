import java.util.Scanner;
class Magical {
    /*
     * Documentation on Magic Square:
     * https://en.wikipedia.org/wiki/Magic_square
     */
     
     /*
      * Generation of a magic square
      * http://www.math.hmc.edu/funfacts/ffiles/10001.4-8.shtml
      */

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the order of which the matrix must be.");
        System.out.println("The order must be odd.");
        int n = in.nextInt();
        printMagical(n);
    }
    public static void printMagical(int n){
        int a[][] = new int[n][n];
        int i,j;
        int p = 1;
        i = 0;
        j = n/2;
        int ti,tj;
        a[i][j] = p++;
        while(p<=n*n){
            ti = i-1;
            tj = j+1;
            if(ti< 0)
                ti = n-1;
            if( tj == n )
                tj = 0;
            if(a[ti][tj]==0){
                a[ti][tj]=p;
                p++;
                i=ti;
                j=tj;
            }
            else {
                ti=i+1;
                if(ti==n)
                    ti=0;
                tj=j;
                if(tj<0)
                    tj=n-1;
                a[ti][tj]=p;
                p++;
                i=ti;
                j=tj;
            }
        }
        printMatrix(a);
    }
    public static void printMatrix(int a[][]){
        int n = a.length;
        int m = a[0].length;
        for( int i=0;i<n;i++){
            for( int j=0;j<m;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
