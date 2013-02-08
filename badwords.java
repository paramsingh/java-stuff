//not written by me.
import java.io.*;
class badwords
{
    public static void main(String args[])throws Exception
    {
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(isr);
        System.out.println("Enter the sentence");
        String sentence=in.readLine();
        String[] words=sentence.split(" ");
        for(int i=0;i<words.length;i++)
        {
            boolean search=false;
            search=ifexist(words[i]);
            if(search==true)
            {
                String replacedWord=change(words[i]);
                System.out.print(replacedWord+" ");
            }
            else
            {
                System.out.print(words[i]+" ");
            }
        }
    }
    
            static boolean ifexist(String word) throws Exception
            {
                FileReader fr=new FileReader("/home/param/Documents/java/badwords/badwords.txt");
                BufferedReader br=new BufferedReader(fr);
                String s="";
                int found=0;
                String text="";
                while((s=br.readLine())!=null )
                {
                    text = text + s+" ";
                }
                String[] filewords=text.split(" ");
                for(int i=0;i<filewords.length;i++)
                {
                    String k=filewords[i];
                    if(k.equalsIgnoreCase(word))
                    {
                        found=1;
                    }
                }
                if(found==1)
                    return true;
                else
                    return false;
            }
            static String change(String wrd)
            {
                String fr="";//for the replaced with * word
                int len=wrd.length();
                fr=wrd.charAt(0)+"";
                for(int i=1;i<len;i++)
                {
                    fr+="*";
                }
                return fr;
        }
    }

