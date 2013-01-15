import java.util.Scanner;
class TypeCheck {
    /*
     * The Problem :
     * http://www.reddit.com/r/dailyprogrammer/comments/13hmz3/11202012_challenge_113_easy_stringtype_checking/
     */ 
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in );
        while(true){
            System.out.println("Enter the string.");
            String input = in.nextLine();
            printType(input);
            System.out.print("Try again(y/n): ");
            if(!in.nextLine().equalsIgnoreCase("y"))
                break;
        }
    }
    public static void printType( String s ){
        if( isInt(s) )
            System.out.println("Integer");
        else if( isFloat(s) )
            System.out.println("Float");
        else if( isDate(s) )
            System.out.println("Date");
        else
            System.out.println("Text");
    }
    public static boolean isInt(String s){
        if(s.contains("."))
            return false;
        else {
            for(int i=0; i<s.length(); i++){
                char ch = s.charAt(i);
                if( !Character.isDigit(ch) ){
                    if( (ch=='+'||ch=='-') && i==0)
                        continue;
                    else
                        return false;
                }
            }
        }
        return true;
    }
    public static boolean isFloat(String s){
        if( !s.contains('.'+"") )
            return false;
        for( int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch) && ch!='.'){
                if( (ch=='+'||ch=='-') && i==0 )
                    continue;
                else
                    return false;
            }
        }
        return true;
    }
    public static boolean isDate( String s ){
        if( s.length() != 10 )
            return false;
        for( int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if( ch!='-' && i==2 && i==5 )
                return false;
            if( i!=2 && i!=5 && !Character.isDigit(ch) )
                return false;
        }
        return true;
    }
}
