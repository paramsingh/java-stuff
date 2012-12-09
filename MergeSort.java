class MergeSort{
    void recMergeSort( int a[], int lower, int upper ){
        if(lower==upper)
            return;
        else{
            int mid = (lower+upper)/2;
            recMergeSort(a,lower,mid);
            recMergeSort(a,mid+1,upper);
            merge(a,lower,mid,upper);
        }
    }
    //Merge function needs to be written
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
        for(i: a){
            System.out.println(i);
        }
    }
}
