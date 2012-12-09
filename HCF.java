class HCF
{
    static int hcf(int x,int y)
    {
        if(x==y){
            return x;
        }
        else if(x>y){
            return hcf(x-y,y);
        }
        else{
            return hcf(x,y-x);
        }
    }
    public static void main(String[] args)
    {
        System.out.println(hcf(6,27));
    }    
}            
