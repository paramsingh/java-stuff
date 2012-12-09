/*
 * Question:
 * Input a string and check if all brackets are closed and balanced in it or not.
 */

import java.util.Stack;
import java.util.EmptyStackException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Brackets
{
    public static void main(String[] args)throws Exception
    {
        InputStreamReader isr = new InputStreamReader( System.in );
        BufferedReader in = new BufferedReader( isr );
        boolean tryAgain=true;
        while(tryAgain)
        {
            System.out.println("Please enter a string");
            String input = in.readLine();
            boolean brackets = checkBrackets(input);
            if(brackets)
                System.out.println("Brackets are balanced.");
            else
                System.out.println("Brackets are not balanced.");
            System.out.print("Try again(y/n): ");
            tryAgain = in.readLine().equalsIgnoreCase("y");
        }
    }

    public static boolean checkBrackets(String s)
    {
        /*
         *
         * Go through the string. When an opening bracket is found, push it onto the stack.
         * When a closing bracket is found, pop an opening bracket off the stack.
         * If the stack is empty and nothing can be popped, the brackets are not balanced.
         * If after having gone through the entire string, the stack is not empty, the
         * brackets are not balanced.
         *
         */

        Stack<String> stack = new Stack<String>(); //making a new empty stack of Strings
        int l=s.length();
        int i;
        for(i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
                stack.push("(");
            if( ch==')'){
                try
                {
                    stack.pop();
                }
                catch(EmptyStackException e)
                {
                    return false;
                }
            }
        }
        if(!stack.empty())
            return  false;
        else
            return true;
    }
}
