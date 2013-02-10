import java.io.*;
class largestprime
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int n=Integer.parseInt(in.readLine());
        int m[][]=new int[n][n];
        int lar=0;
        int t,p=0,q=0,d,r;
        System.out.println("Enter a matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                m[i][j]=Integer.parseInt(in.readLine());
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                d=0;
                for(r=1;r<=m[i][j];r++)
                {
                    if(m[i][j]%r==0)
                    d++;
                }
                if(d==2 && m[i][j]>lar)
                {
                    lar=m[i][j];
                    p=i;
                    q=j;
                }
            }
        }
        if(lar!=0)
        System.out.println(lar+" "+p+" "+q);
        else 
        System.out.println("No prime");
    }
}
