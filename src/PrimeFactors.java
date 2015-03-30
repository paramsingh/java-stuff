import java.util.Scanner;
public class PrimeFactors {
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter a number");
        int n = in.nextInt();
        int dup = n;
        int sum =0;
        int dividor = 2;
        while( dup!=0 ){
            if( isPrime(dividor) && dup % dividor ==0 ){
                while( dup % dividor != 0){
                    sum += dividor;
                    dup/=dividor;
                }
            }
            else 
                dividor++;
        }
            
        System.out.println(sum);
    }
    public static boolean isPrime(int n){
                     for(int i=2;i<n;i++){
                if( n%i==0 )
                    return false;
            }
            return true;
        }
    }
}
