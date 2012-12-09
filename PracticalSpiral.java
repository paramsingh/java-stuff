/*
 * 1    2   6   7
 * 3    5   8   13
 * 4    9   12  14
 * 10   11  15  16
 */ 
public class PracticalSpiral {
    public static void main ( String args[] ) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the number");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int i,j;
        while( count<(n*n) ){
            for(i=0; i<n; i++){
                for(j=0;j<n;j++){
                    if( (i+j)%2==0 ){
                        if(k%2==0)
                            a[j][i] = count++;
                        else
                            a[i][j] = count++;
                        k++;
                    }
                    else {
                       //more needs to be written 
