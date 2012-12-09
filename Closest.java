import java.io.*;
public class Closest
{
	public static void main(String args[])throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array");
		int n=Integer.parseInt(in.readLine());
		int a[]=new int[n];
		System.out.println("Enter the array");
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(in.readLine());
		}
		System.out.println("Enter the number");
		int x=Integer.parseInt(in.readLine());
		int ld=Math.abs(x-a[0]);
		int answer=a[0];
		for(int i=0;i<n;i++){
			int diff=Math.abs(x-a[i]);
			if(ld>diff){
				ld=diff;
				answer=a[i];
			}
		}
		System.out.println("The closest number I could find in the array is "+answer+".");
	}
}
