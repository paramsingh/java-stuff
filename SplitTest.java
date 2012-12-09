public class SplitTest
{
	public static void main(String[] args)
	{
		String s="Hello my name is Param. How are you? I am fine! What is the time? I dunno.";
		String st[]=s.split("[/.?!]");
		for(String a:st)
			System.out.println(a.trim());
		System.out.println("I just got split to work. Yay!");
	}
}
