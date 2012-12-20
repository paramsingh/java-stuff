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
    public static void main(String[] args){
        output("SCIENCE",5);
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
