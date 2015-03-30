import java.util.Scanner;
public class ScientificNotation
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number");
            int input = in.nextInt();
            System.out.println("In scientific Notation:");
            System.out.println(toScientific(input));
            System.out.println("From Scientific");
            System.out.println(fromScientific(toScientific(input)));
            System.out.println("0.93 * 10^5 = "+fromScientific("0.93*10^5"));
            System.out.print("Try again(y/n): ");
            if( !in.next().equalsIgnoreCase("y") )
            {
                break;
            }
        }
    }
    public static String toScientific(int n)
    {
        String scientific ="";
        double a;
        if(n==0)
            return "0 * 10^0";
        if(n>0 && n<10)
            return n+" * 10^0";
        else
        {

            int power = 0;
            int dup = n;
            while(dup!=0)
            {
                dup = dup/10;
                power++;
            }
            power--;
            scientific ="10^"+power;
            a = ((double)n)/Math.pow(10,power);

        }
        return a + "*"+scientific;
    }
    public static int fromScientific(String s)
    {
        s=s.trim();
        int len = s.length(), power = Integer.parseInt(s.charAt(len-1)+"");
        int i;
        String num="";
        for(i=0;i<len;i++)
        {
            char ch = s.charAt(i);
            if(ch=='*')
                break;
            else
                num =num+s.charAt(i);
        }
        double a = Double.parseDouble(num.trim());
        return (int)(a*Math.pow(10,power));
    }
}
