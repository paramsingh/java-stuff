import java.io.*;
public class Read
{
    public static void main(String[] args)throws Exception
    {
        FileReader fr=new FileReader("/home/param/Downloads/hello.txt");
        BufferedReader br=new BufferedReader(fr);
        String text;
        while((text=br.readLine())!=null)
        {
            System.out.println(text);
        }
        br.close();
        fr.close();
    }
}
