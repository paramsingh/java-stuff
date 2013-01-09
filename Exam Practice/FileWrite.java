import java.io.*;
public class FileWrite {
    public static void main( String[] args ) throws IOException {
        FileWriter fw = new FileWriter("/home/param/student.txt");
        // to append something to an existing file, add true to the constructor
        // like FileWriter fw = new FileWriter(<filepath>,true);
        BufferedWriter bw = new BufferedWriter( fw );
        PrintWriter pw = new PrintWriter( bw );
        for( int i =0 ; i<=10; i++ ){
            pw.print(i+",");
        }
        pw.close();
        bw.close();
        fw.close();
    }
}
