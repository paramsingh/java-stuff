import java.util.Scanner;
public class SortMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        //All the inputs and stuff
        System.out.println("Enter the value of n");
        int n = in.nextInt();
        System.out.println("Enter the matrix");
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Original matrix is : ");
        printMatrix(a);
        
        //sorting
        int i,j,k,l,temp;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    for(l=0;l<n;l++){
                        if(a[i][j]<a[k][l]){
                            temp = a[i][j];
                            a[i][j] = a[k][l];
                            a[k][l] = temp;
                        }
                    }
                }
            }
        }
        
        System.out.println("Sorted matrix :");
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
