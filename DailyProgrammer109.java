import java.io.*;
public class DailyProgrammer109
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a_start, a_end, b_start and b_end");
        int a_start = Integer.parseInt(in.readLine());
        int a_end = Integer.parseInt(in.readLine());
        int b_start = Integer.parseInt(in.readLine());
        int b_end = Integer.parseInt(in.readLine());
        outerloop:
        for(int i=a_start;i<=a_end;i++) {
            for(int j= b_start;j<=b_end;j++) {
                if(isPalindrome(i*j)) {
                    System.out.println(i+","+j);
                    break outerloop;
                }
            }
        }
    }
    public static boolean isPalindrome(int n)
    {
        String num = n+"";
        String rev="";
        int l= num.length();
        for(int i=0;i<l;i++)
            rev=num.charAt(i)+rev;
        return rev.equals(num);
    }
}
