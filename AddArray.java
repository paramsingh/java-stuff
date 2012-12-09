/*
 * Google Interview Question
 *
 * Given a number represented as an array of digits, plus one to the number.
 * ie. 1000 is [1,0,0,0] and result is [1,0,0,1]
 *
 */

 public class AddArray
 {
    public static void main(String[] args)
    {
        int a[]={9,9,8,7};
        int sum[] = addOne(a);
        for(int i:sum)
            System.out.print(i);
    }

    public static int[] addOne(int[] a)
    {
        int l = a.length,i=l-1;
        int carry=0;
        while(i>=0)
        {
            a[i]=a[i]+1;
            if(a[i]<10)
            {
                carry=0;
                break;
            }
            else
            {
                a[i]=0;
                i--;
                carry=1;
            }
        }
        if(carry==1)
        {
            int b[]=new int[a.length+1];
            b[0]=1;
            for(i=1;i<b.length;i++)
                b[i]=0;
            return b;
        }
        else return a;
    }
 }
