import java.io.*;
public class BinaryInput
{
    public static void main(String[] args)throws Exception
    {
        FileInputStream fin= new FileInputStream("/home/param/java/binary.bin");
        DataInputStream din = new DataInputStream(fin);
        boolean eof=false;
        while(!eof)
        {
            try
            {
                System.out.println(din.readInt());
                System.out.println(din.readDouble());
                System.out.println(din.readUTF());
            }
            catch(EOFException e)
            {
                System.out.println(e);
                eof=true;
            }
        }
    }
}
            
