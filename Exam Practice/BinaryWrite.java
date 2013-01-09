import java.io.*;
public class BinaryWrite {
    public static void main( String[] args ) throws Exception {
        FileOutputStream fout = new FileOutputStream("/home/param/binaryfile.bin");
        DataOutputStream dout = new DataOutputStream(fout);
        dout.writeInt(32);
        dout.writeUTF("ABS");
        dout.close();
        fout.close();
    }
}
