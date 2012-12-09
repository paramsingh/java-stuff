import java.io.*;
public class Sequence
{
    public static void main(String[] args)throws Exception
    {
        BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        int freq[] = new int[100];
        int i,j,mode=-1,max=-1;
        System.out.println("Enter the sequence");
        while(true) {
            i = Integer.parseInt(in.readLine());
            if(i==-1)
                break;
            freq[i-1]++;
        }
        boolean modeExists = true;
        for(i=0;i<100;i++) {
            if(freq[i]>max) {
                max=freq[i];
                mode=i+1;
            }
        }
        for(i=0;i<100;i++) {
            if(freq[i]==max && mode-1!=i)
                modeExists = false;
        }
        if(modeExists)
            System.out.println("Mode : "+mode);
        else
            System.out.println("Mode : 0");
    }
}
