//http://www.respaper.com/isc/552/674.pdf
//Question 8

import java.util.Scanner;
public class Prime {
    int arr[][];
    int r,c;
    Prime(){
        Scanner in = new Scanner( System.in );
        System.out.println("p");
        r = in.nextInt();
        c = in.nextInt();
        arr = new int[r][c];
    }
    void display(){
        System.out.println(r+"x"+c);
    }
    public static void main( String[] args ){
        Prime a = new Prime();
        a.display();
    }
}
    
