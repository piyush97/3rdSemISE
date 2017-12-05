import java.io.*;
import java.util.*;
class Q5
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number of sentences: "); //inputting the number of sentences to accept
        int n = Integer.parseInt(br.readLine());
        String s = "";
        for(int i=1; i<=n; i++)
        {
            System.out.print("Enter Sentence "+i+": ");
            s = s + br.readLine(); //inputting multiple sentences and joining them in the same String
        }
        StringTokenizer str=new StringTokenizer(s," '.,;:!?");
        int c=str.countTokens();
        String w="", rev="";
        for(int i=1; i<=c; i++)
        {
            w = str.nextToken(); //extracting one word at a time
            rev = w+" "+rev; //joining the extracted words in reverse order
        }
        
        System.out.println("Output: "+rev);
    }
}