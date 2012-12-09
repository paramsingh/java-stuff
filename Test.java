public class Test
{
    public static void main(String[] args)
    {
        System.out.println(digittest("0123"));
        System.out.println(digittest("ab"));

    }
    public static boolean digittest(String s)
    {
        int x = 0;
        for(int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                x++;
        }
        return x==s.length();
    }
}
