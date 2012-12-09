/* 
 * In England the currency is made up of pound, £, and pence, p,
 * and there are eight coins in general circulation:
 * 
 * 1p, 2p, 5p, 10p, 20p, 50p, £1 (100p) and £2 (200p).
 * 
 * It is possible to make £2 in the following way:
 * 
 * 1×£1 + 1×50p + 2×20p + 1×5p + 1×2p + 3×1p
 * 
 * How many different ways can £2 be made using any number of coins?
 */
class Euler31 {
    public static void main(String[] args){
        int target =200;
        int ways=0;
        int i,j,k,l,m,n,o;
        float time = System.currentTimeMillis();
        for(i=target;i>=0;i-=200){
            for(j=i;j>=0;j-=100){
                for(k=j;k>=0;k-=50){
                    for(l=k;l>=0;l-=20){
                        for(m=l;m>=0;m-=10){
                            for(n=m;n>=0;n-=5){
                                for(o=n;o>=0;o-=2){
                                    ways++;
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(ways);
        System.out.println(System.currentTimeMillis()-time);
    }
}
