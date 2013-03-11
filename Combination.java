// http://www.respaper.com/isc/552/674.pdf
// Question 10
import java.util.Scanner;
public class Combination {
    int n, k;
    Combination() {
        //default constructor
        //initialize data members to 0 or null
        n = 0;
        k = 0;
    }
    void read() {
        //function to input values of data members
        Scanner in = new Scanner( System.in );
        System.out.println( "Enter the values of n and k. n must always be greater than k.");
        n = in.nextInt();
        k = in.nextInt();
    }
    int fact( int a ) {
        //function to return the factorial of a using recursion
        if( a==1 || a==0 )
            return 1;
        else 
            return a*fact(a-1);
    }
    void compute(){
        //function to compute C(n,k) where n and k are data members
        
        //use fact to calculate the factorial of n and store it in n_fact
        int n_fact = fact(n);
        //factorial of k
        int k_fact = fact(k);
        //factorial of n-k
        int diff_fact = fact(n-k);
        //calculate C(n,k) using formula
        int combination_val = n_fact/( k_fact*diff_fact );
        
        System.out.println(combination_val);
    }
    void display() {
        //display the answer
        compute();
    }
    public static void main( String[] args ){
        //Create an object of class Combination
        Combination ob = new Combination();
        //input the values from the user by calling read() using ob
        ob.read();
        //display the combination by calling display() using ob
        ob.display();
    }
}
