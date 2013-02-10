import java.util.Scanner;
public class SortPrincipalDiagonal {
    public static void main( String[] args ){
        //input the array
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the matrix");
        int a[][] = new int[3][3];
        int i,j;
        for( i=0;i<3;i++){
            for(j=0;j<3;j++)
                a[i][j] = in.nextInt();
        }
        //print original matrix
        System.out.println("Original matrix");
        for( i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
        //begin sorting
        for( i=0;i<3;i++ ){
            for(j=0;j<3;j++){
                if( a[i][i]<a[j][j] ){
                    int temp = a[i][i];
                    a[i][i] = a[j][j];
                    a[j][j] = temp;
                }
            }
        }
        //print the sorted matrix
        System.out.println("sorted matrix");
        for( i=0;i<3;i++){
            for(j=0;j<3;j++)
                System.out.print(a[i][j]);
            System.out.println();
        }
    }
}
