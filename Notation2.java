import java.io.*;
public class Notation2
{
    public static void main( String[] args)
    {
        System.out.println("Please enter a number");
        String s = System.console().readLine();
        System.out.println(toScientific(s));
    }
    public static String toScientific(String s)
    {
