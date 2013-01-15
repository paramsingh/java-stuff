public class Pattern {
    public static void main(String[] args){
        int n = 4;
        int i,j;
        for(i=1;i<=n;i++){
            for(j=i;j<=n;j++){
                System.out.print(j);
            }
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
