import java.io.*;
class Encrypting
{
    public static void main(String args[])throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int l;
        char a,b,c;
        String k="";
        System.out.println("Enter the string");
        String s=in.readLine();
        l=s.length();
        l--;
        //
        while(l>0){
            a=s.charAt(l);
            if(a!='1'){
                b=s.charAt(l-1);
                k=""+a+b;
                l=l-2;
            }
            else{
                b=s.charAt(l-1);
                c=s.charAt(l-2);
                k=a+b+c+"";//7927
                l=l-3;
            }
            int j=Integer.parseInt(k);
            System.out.print((char)j);
            k="";
        }
    }
}
