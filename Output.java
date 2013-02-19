import java.util.Scanner;
class Output {
    static void output(String n, int p){
        //Function came in ISC 2012. Had to find the output for ("SCIENCE",5)
        if(p<0)
            System.out.println();
        else {
            System.out.println(n.charAt(p)+".");
            output(n,p-1);
            System.out.print(n.charAt(p));
        }
    }
    static int fun(int a, int b, int n){
        //This function came in preboards. Had to find the return value
        //for fun(4,7,5) and fun(2,3,5)
        if(n!=1)
            return a+ fun(b,a+b, n-1);
        else 
            return a;
    }
    public static void main(String[] args){
        //printing output of output()
        output("SCIENCE",5);
        System.out.println("\n");
        //printing output of fun()
        System.out.println(fun(4,7,5));
        System.out.println(fun(2,3,5));
        //printing a random number between 1 & 100
        System.out.println("Random number");
        System.out.println((int)(Math.random()*100));
        //check how substring() works
        System.out.println("Fuck".substring(0,3));
        String s = "Fuck Fuck Fuck";
        System.out.println(s.indexOf("uck"));
        System.out.println("fuck".compareTo("guck"));
        //Scanner check
        Scanner in = new Scanner( System.in );
        System.out.println("Enter 1");
        int n = in.nextInt();
        System.out.println("Enter 2");
        int a = in.nextInt();
        System.out.println(n+" "+a);
    }
}

/* 
 * Output is 
 * C.
 * N.
 * E.
 * I.
 * C.
 * S.
 * 
 * SCIENC
 */
 
 /*
  * Output for fun(4,7,5) should be 69
  * Output for fun(2,3,5) should be 31
  */
