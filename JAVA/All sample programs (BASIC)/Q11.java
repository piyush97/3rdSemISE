import java.io.*;
class Q11
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s="";
        char dig[]={'0','1'};
        while(n>0)
            {
                r=n%2;
                s=dig[r]+s;
                n=n/2;
            }
        System.out.println("Output = "+s);
    }
}