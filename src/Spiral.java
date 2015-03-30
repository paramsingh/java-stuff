import java.io.*;
public class Spiral {
    /*
     * Program to generate a pattern. Question can be found in Practical of II Term.
     *
     * For even n*n matrix
     *
     * 1    2   6   7
     * 3    5   8   13
     * 4    9   12  14
     * 10   11  15  16
     *
     */
    public static void main( String[] args ) throws Exception {
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        System.out.println("Please enter the value of n");
        int n = Integer.parseInt( in.readLine() );
        int a[][] = new int[n][n];
        int x=1,p=0,i,j;
        while(x<=n*n) {
            for(i=0;i<n;i++) {
                for(j=0;j<n;j++) {
                    if(i+j==p)
                    {
                        if(p%2!=0)
                            a[i][j]=x++;
                        else
                            a[j][i]=x++;
                    }
                }
            }
            p++;
        }
        for( i=0;i<n;i++ ){

            for( j=0;j<n;j++ )
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
