// A class to store all the patterns I might write.
public class Patterns {
    public static void pattern1( int n ){
        /*
         * 12345
         * 22345
         * 33345
         * 44445
         * 55555
         */
        int i, temp,j;
        for( i=1;i<=n;i++ ){
            for( j=1;j<i;j++ )
                System.out.print(i);
            for( temp=i;temp<=n;temp++ )
                System.out.print(temp);
            System.out.println();
        }
    }
    public static void pattern2( int n ){
        /*
         * For n = 5:
         * 
         * 13579
         * 33579
         * 55579
         * 77779
         * 99999
         */
        int i,temp,j;
        for( i=1;i<=5;i++ ){
            for( j=1;j<i;j++ )
                System.out.print((2*i)-1);
            for( temp = 2*i-1;temp <= 2*n-1;temp+=2 )
                System.out.print(temp);
            System.out.println();
        }
    }
    public static void main( String[] args ){
        pattern1(5);
        System.out.println();
        pattern2(5);
    }
}
