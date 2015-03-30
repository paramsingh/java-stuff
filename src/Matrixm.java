import java.io.*;
public class Matrixm
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        //input

        System.out.println("Please enter the order of the first matrix");
        String s=in.readLine();
        int n=Integer.parseInt(s.charAt(0)+"");
        int m=Integer.parseInt(s.charAt(2)+"");
        System.out.println("Please enter the order of the second matrix");
        s=in.readLine();
        int a=Integer.parseInt(s.charAt(0)+"");
        int b=Integer.parseInt(s.charAt(2)+"");
        if(a!=m){
            System.out.println("Matrices cannot be multiplied. Please try again.");
            System.exit(0);
        }
        int m1[][]=new int[n][m];//first matrix
        int m2[][]=new int[a][b];//second matrix
        int product[][]=new int[n][b];//Product of first and second will be stored here.
        System.out.println("Please enter the first matrix");
        int i,j,count=0,sum,k,c;
        for( i=0;i<n;i++)//inputting first matrix
            for( j=0;j<m;j++)
                m1[i][j]=Integer.parseInt(in.readLine());
        System.out.println("Please enter the second matrix");
        for( i=0;i<m;i++)//inputting second matrix
            for( j=0;j<b;j++)
                m2[i][j]=Integer.parseInt(in.readLine());
        int temp[]=new int[n*b];//used to store values which will later be put into the product matrix

        //actual calculation
        for(i=0;i<n;i++)
        {
            for(j=0;j<b;j++)
            {
                sum=0;
                for(k=0;k<m;k++)
                {
                    c=m1[i][k]*m2[k][j];
                    sum=sum+c;
                }
                temp[count++]=sum;
            }
        }
        count=0;

        //Now put the values in temporary matrix into the real product matrix

        for(i=0;i<n;i++)
        {
            for(j=0;j<b;j++)
                product[i][j]=temp[count++];
        }

        //Print the product
        for(i=0;i<n;i++)
        {
            for(j=0;j<b;j++)
                System.out.print(product[i][j]+"\t");
            System.out.println();
        }
    }
}
