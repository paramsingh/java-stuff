import java.io.*;
public class Derivative
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter xmax and xmin");
		int xmax=Integer.parseInt(in.readLine());
		int xmin=Integer.parseInt(in.readLine());
		System.out.println("enter the values of y");
		int y[]=new int[xmax-xmin];
		int i;
		for(i=0;i<xmax-xmin;i++)
			y[i]=Integer.parseInt(in.readLine());
		System.out.println(derivative(xmin,xmax,y));
	}
	public static int[] derivative(int min,int max,int[] y)
	{
		int i;
