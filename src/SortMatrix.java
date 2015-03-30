import java.util.Scanner;
public class SortMatrix {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println(" Enter n.");
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int i,j,k,l;
        //input the matrix;
        System.out.println("Enter the matrix.");
        for( i=0;i<n;i++ ){
            for( j=0;j<n;j++ ){
                a[i][j] = in.nextInt();
            }
        }
        //Print the original matrix;
        for( i=0;i<n;i++ ){
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
        //Begin sorting;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    for(l=0;l<n;l++){
                        if(a[i][j]<a[k][l]){
                            int temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;
                        }
                    }
                }
            }
        }
        //Print the sorted matrix    
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
