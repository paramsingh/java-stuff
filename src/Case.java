import java.util.*;
class Case {
    String str, newstr;
    int len;
    Case(){
        str="";
        len = 0;
        newstr = "";
    }
    void input(){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the string.");
        str = in.nextLine();
        len = str.length();
        newstr = "";
    }
    char changeCase(char ch){
        if( Character.isUpperCase(ch) )
            return Character.toLowerCase(ch);
        else
            return Character.toUpperCase(ch);
    }
    void rechange(int x){
        if( x==len )
            return;
        else {
            newstr = newstr + changeCase(str.charAt(x));
            rechange(x+1);
        }
    }
    public static void main(String args[]){
        Case ob = new Case();
        ob.input();
        ob.rechange(0);
        System.out.println(ob.newstr);
    }
}
