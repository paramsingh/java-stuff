import java.io.*;
public class BinaryOutput
{
    public static void main(String[] args)throws Exception
    {
       FileOutputStream fout=new FileOutputStream("/home/param/java/binary.bin");
       DataOutputStream dout = new DataOutputStream(fout);
       dout.writeInt(1);
       dout.writeDouble(213.2133);
       dout.writeUTF("Hello");
       dout.close();fout.close();
    }
}
