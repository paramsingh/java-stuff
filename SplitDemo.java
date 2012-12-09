import java.util.regex.*;
public class SplitDemo
{
	public static void main(String[] args)
	{
		Pattern regex = Pattern.compile("[/.?!]");
		String input="Hi my name is Param. I am a boy. How are you? I am fine!";
		String[] a = regex.split(input);
		for(String s:a)
			System.out.println(s.trim());
	}
}
