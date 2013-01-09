import java.io.*;
public class FileRead {
    public static void main(String[] args) throws Exception{
        FileReader fr = new FileReader("/home/param/student.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while( (s=br.readLine()) != null){
            System.out.println(s);
        }
    }
}
