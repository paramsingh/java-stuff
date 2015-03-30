import java.util.Scanner;
public class Hamming {
    
    /**
     * Write a program which inputs a binary number and a Hamming distance.
     * Then print all the binary numbers which have the given Hamming distance
     * from the binary number.
     */
    
    public static String convertToBinary(int a,int l){
        //Convert a to binary having length l and return it.
        String bin = "";
        for(int i=0;i<l;i++){
            bin = a%2 + bin;
            a/=2;
        }
        return bin;
    }
    public static String[] returnBinaries(int len){
        //return all binary numbers having length equal to len
        int total = 0;
        for(int i=0;i<len;i++){
            total+= (int)Math.pow(2,i);
        }
        String[] bins = new String[total];
        for(int i=0;i<total; i++){
            bins[i] = convertToBinary(i, len);
        }
        return bins;
    }
    public static int hammingDist(String a, String b){
        // return the hamming ditance between a and b.
        int len = a.length(), dist=0;
        for( int i=0; i<len; i++){
            if( a.charAt(i) != b.charAt(i) )
                dist++;
        }
        return dist;
    }
    public static void main( String[] args ) {
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the binary number");
        String bin = in.nextLine();
        System.out.println("Enter the required Hamming distance.");
        int dist = in.nextInt();
        String[] allBins = returnBinaries(bin.length());
        for( String s : allBins){
            if( hammingDist(s,bin)==dist )
                System.out.print(s+",");
        }
    }
}
