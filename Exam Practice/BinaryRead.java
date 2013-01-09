import java.io.*;
public class BinaryRead {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("/home/param/binaryfile.bin");
        DataInputStream din = new DataInputStream(fin);
        boolean eof = false;
        while(!eof){
            try{
                System.out.println(din.readInt());
                System.out.println(din.readUTF());
            }
            catch( EOFException e){
                System.out.println("EOF");
                eof = true;
            }
        }
    }
}
