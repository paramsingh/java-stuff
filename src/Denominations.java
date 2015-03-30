import java.util.Scanner;
public class Denominations {
    public static void main( String[] args ){
        int val[] = {1000,500,100,50,20,10,5,2,1};
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the cost.");
        int input = in.nextInt();
        String words[] = {"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX",
                          "SEVEN","EIGHT","NINE"};
        String inWords = "";
        int dup = input;
        while( dup!=0 ){
            inWords = words[dup%10]+" "+inWords;
            dup /= 10;
        }
        dup = input;
        System.out.println( inWords );
        for( int i=0;i<9;i++){
            int numNotes = dup/val[i];
            if(numNotes!=0){
                System.out.println(val[i]+" X "+numNotes+"="+(numNotes*val[i]));
                dup = dup%val[i];
            }
        }
    }
}
