import java.io.*;
public class Names {
    public static void main( String[] args)throws Exception{
        FileReader fr = new FileReader("/home/param/Documents/java/names.txt");
        BufferedReader br = new BufferedReader(fr);
        String file_content = br.readLine();
        String[] names = file_content.split(",");
        int i,j;
        int score = 0;
        int sum;
        String alphabet = "ABCDEFGHIJKLMNOQRSTUVWXYZ";
        int numberOfNames = names.length;
        for(i=0;i<numberOfNames;i++){
            int len = names[i].length();
            sum = 0;
            for(j=0;j<len;j++){
                char ch = names[i].charAt(j);
                if(ch!='\"'){
                    sum = sum + alphabet.indexOf(ch)+1;
                }
            }
            score += (sum * (i+1) );
        }
        System.out.println(score);
    }
}
