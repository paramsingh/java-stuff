import java.util.Scanner;
public class PrimePalindrome {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter m and n ");
        int m =in.nextInt();
        int n = in.nextInt();
        for( int i=m;i<n;i++ ){
            if( isPalindrome(i) && isPrime(i) ){
                System.out.print(i+",");
            }
        }
    }
    public static boolean isPalindrome(int n){
        String s = n+"";
        int l = s.length();
        String rev = "";
        for(int i=l-1;i>=0;i--){
            rev = rev + s.charAt(i);
        }
        return rev.equals(s);
    }
    public static boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}  
