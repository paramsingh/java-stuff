import java.util.*;
public class StackCheck
{
    public static void main(String[] args)
    {
        Stack<String> a = new Stack<String>();
        a.push("!");
        a.push("HELLO");
        System.out.println(a.empty());
    }
}
