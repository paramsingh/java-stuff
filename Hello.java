import java.io.*;
public class Hello
{
	public static void main(String[] args)
	{
		Console in = System.console();
		System.out.println("Enter a number");
		String n = in.readLine();
                System.out.println(n);
	}
}
