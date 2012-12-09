import java.math.BigInteger;
public class DigitalSum
{
    public static void main(String[] args)
    {
        int i,j;
        for(i=2;i<100;i++)
        {
            for(j=2;j<100;j++)
            {
                BigInteger n = new BigInteger(i);
                n= n.pow(4);
                System.out.println(n);
            }
        }
    }
}
