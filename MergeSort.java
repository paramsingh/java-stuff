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
}
