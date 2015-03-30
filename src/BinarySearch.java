class BinarySearch
{
    static int bin(int a[],int x,int start,int end)
    {
        if(start>end)
            return -1;
        else
        {
            int mid=(start+end)/2;
            if(a[mid]>x)
                return bin(a,x,start,mid);
            else if(a[mid]<x)
                return bin(a,x,mid,end);
            else
                return mid;
        }
     }
     static void binarySearch(int a[],int x)
     {
        System.out.println(bin(a,x,0,a.length));
     }
     public static void main(String[] args)
     {
        int a[]={0,1,2,3,4,5,6,7,8,9,10};
        binarySearch(a,11);
     }
}     
