import java.util.Scanner;
public class Date {
    
    public static void main( String[] args ){
        Scanner in = new Scanner( System.in );
        System.out.println("Enter the number.");
        int days = in.nextInt();
        System.out.println("Enter the year.");
        int year = in.nextInt();
        System.out.println("Enter n.");
        int n = in.nextInt();
        //print the date for the days-th day of the year
        System.out.println( findDate(days, year));
        //print the date for the (days+n)th day of the year
        System.out.println( findDate(days+n, year));
    }
    
    public static String findDate( int n, int year ){
        //returns the date of nth day of the year
        //returns in "24 8 2008" format
        int numDays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if( year%4==0 )//if year is a leap year
            numDays[1]=29;
        if( n>sum(numDays) )
            //if the date will go into the next year
            //call the function for the next year with decreased
            //number of dates
            return findDate( n-sum(numDays), year+1);
        int dup = n;
        for( int i=0;i<12;i++){
            //if the req date lies in the i'th month
            if( dup<numDays[i] )
                return dup+" "+(i+1)+" "+year;
            else
                dup = dup - numDays[i];
        }
        //control will never get here
        return "";
    }
    
    public static int sum( int a[] ){
        //return the sum of all the elements of a
        int sum=0;
        for( int i=0;i<a.length;i++ ){
            sum += a[i];
        }
        return sum;
    }
}
