/** Write a program to input a number and check if it's magic or not */
import java.util.*;
public class Magic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = in.nextInt();
        int sum = sumOfDigits(num);
        while(sum>9){
            num = sum;
            sum = sumOfDigits(num);
        }
        if( sum==1 )
            System.out.println("Number is a magic number.");
        else
            System.out.println("Number isn't a magic number.");
    }
    public static int sumOfDigits(int num){
        int sum=0;
        while(num!=0){
            sum += num%10;
            num/=10;
        }
        return sum;
    }
}
