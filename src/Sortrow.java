//Not written by me but what I would have wrote.
import java.io.*;
class Sortrow
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        int m[][]=new int[n][n];
        int t;
        System.out.println("Enter a matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=Integer.parseInt(in.readLine());
            }
        }
        System.out.println("Original matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        //begin sorting
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int r=j+1;r<n;r++)
                {
                    if(m[i][j]>m[i][r])
                    {
                        t=m[i][j];
                        m[i][j]=m[i][r];
                        m[i][r]=t;
                    }
                }
            }
        }
        System.out.println("Sorted Matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
