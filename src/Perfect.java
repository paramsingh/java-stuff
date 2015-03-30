import java.util.*;
class Perfect {
    int n;
    Perfect(){
        n = 0;
    }
    Perfect(int n){
        this.n = n;
    }
    void perfect_sq(){
        boolean found = false;
        int check = n;
        while( !found ){
            int root = (int) Math.sqrt(check);
            if( root*root == check ){
                found = true;
            }
            else{
                check ++;
            }
        }
        System.out.println("Closest perfect square = "+check);
        System.out.println("Square root is "+(int)Math.sqrt(check));
    }
    void sum_of(){
        //
    }
    public static void main(String[] args){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the number.");
        int n = in.nextInt();
        Perfect ob = new Perfect(n);
        ob.perfect_sq();
        ob.sum_of();
    }
}
