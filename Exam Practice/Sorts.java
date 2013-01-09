public class Sorts {
    //class to store all the sorting algorithms i need to know

    //selection sort
    static void selection_sort(int a[]){
        int l = a.length;
        int i,j;
        for(i=0;i<l;i++){
            int pos = i;
            int smallest = a[i];
            for(j=i+1;j<l;j++){
                //finding the smallest element in the array from i+1 to the end
                if(smallest > a[j]){
                    //store the position of the smallest element in pos and the
                    //element itself in smallest.
                    pos = j;
                    smallest = a[j];
                }
            }
            //swap the smallest element with the element at position i
            a[pos] = a[i];
            a[i] = smallest;
        }
    }

    //insertion sort
    static void insertion_sort(int a[]){
        int i,val,last;
        int l = a.length;
        for(i=0;i<l;i++){
            last = i;
            val = a[i];
            while( last>0 && val<a[last-1] ){
                a[last] = a[last-1];
                last --;
            }
            a[last] = val;
        }
    }

    //bubble sort
    static void bubble_sort(int a[]){
        int i,j,t,l=a.length;
        for(i=0;i<l;i++){
            for(j=1;j<(l-i);j++){
                if(a[j-1]>a[j]){
                    t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                }
            }
        }
    }
    
    public static void main(String[] args){
        int a[] = {9,8,7,5,4,3,3,1};
        insertion_sort(a);
        for(int i: a){
            System.out.println(i);
        }
    }
}

