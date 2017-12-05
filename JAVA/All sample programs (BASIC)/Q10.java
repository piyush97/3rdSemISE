import java.io.*;
class Q10
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s=""; //variable for storing the result
        char dig[]={'0','1','2','3','4','5','6','7'}; //array storing the digits (as characters) in the octal number system
        while(n>0)
            {
                r=n%8; //finding remainder by dividing the number by 8
                s=dig[r]+s; //adding the remainder to the result and reversing at the same time
                n=n/8;
            }
        System.out.println("Output = "+s);
    }
}