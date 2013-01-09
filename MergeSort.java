import java.util.Scanner;
class MergeSort{
    static void recMergeSort( int a[], int lower, int upper ){
        if(lower==upper)
            return;
        else{
            int mid = (lower+upper)/2;
            recMergeSort(a,lower,mid);
            recMergeSort(a,mid+1,upper);
            merge(a,lower,mid,upper);
        }
    }
    static void merge(int a[] ,int lower, int mid , int upper){
        int i= lower;
        int j= mid+1;
        int n = upper-lower + 1;
        int b[] = new int[n];
        int p=0;
        while( i<=mid && j<=upper ){
            if ( a[i]>=a[j] )
                b[p++] = a[i++];
            else
                b[p++] = a[j++];
        }
        while( i<=mid ) {
            b[p++] =a[i++];
        }
        while( j<=upper ) {
            b[p++]=a[j++];
        }
        a=b;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = in.nextInt();
        int a[] = new int[size];
        int i;
        System.out.println("Enter the array");
        for(i=0; i<size; i++){
            a[i] = in.nextInt();
        }
        System.out.println("Original array is: ");
        for(int j: a){
            System.out.println(j);
        }
        recMergeSort(a, 0, size-1);
        System.out.println("Sorted Array is : ");
        for( int j:a)
            System.out.println(j);
    }
}
