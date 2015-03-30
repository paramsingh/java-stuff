import java.io.*;
public class Sentence
{
	public static void main(String args[])throws Exception
	{
		BufferedReader in = new BufferedReader( new InputStreamReader(System.in));
		System.out.println("Enter the string.");
		String s=in.readLine().toUpperCase();
		int l=s.length(),n=0;
		for(int i=0;i<l-1;i++)
		{
			char ch=s.charAt(i);
			char c=s.charAt(i+1);
			if(ch==c)
				n++;
		}
		System.out.println(n);
	}
}
