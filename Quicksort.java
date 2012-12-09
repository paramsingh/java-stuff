class Quicksort {
    public static void quicksort(int a[], int left, int right){
        int left1=left, right1=right, pivot = a[left];
        while(left<right){
            while( a[right]>pivot && left<right )
                right--;
            if( left<right )
                a[left++] = a[right];
            while( a[left]<pivot && left<right )
                left++;
            if( left<right )
                a[right--] = left;
        }
        a[left] = pivot;
        pivot = left;
        left = left1;
        right = right1;
        if(left<pivot)
            quicksort(a,left,pivot-1);
        if(right>pivot)
            quicksort(a,pivot+1,right);
    }
    public static void quicksort(int a[]){
        quicksort(a,0,a.length-1);
    }
    public static void main(String[] args){
        int a[] = {9,8,7,6,5,4,3,2,1};
        quicksort(a);
        for(int i: a)
            System.out.println(i);
    }
}
