/** 
 * A Double mersenne number is a number which can be represented as 2^(2n-1)
 * Write a program to check if a number is double mersenne or not.
 */
import java.util.*;
public class Mersenne {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        long num = in.nextLong();
        if(isMersenne(num))
            System.out.println("Number is double Mersenne.");
        else
            System.out.println("Number is not double Mersenne.");
    }
    public static boolean isMersenne(long num) {
        int i=1;
        long check=0,pwr;
        boolean isMersenne = false;
        while(check<num) {
            pwr = (long)(Math.pow(2,i)-1);
            check = (long)(Math.pow(2,pwr)-1);
            if(check == num){
                isMersenne = true;
                break;
            }
            i++;
        }
        return isMersenne;
    }
}
