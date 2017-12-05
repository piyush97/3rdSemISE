import java.io.*;
class Q9
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter a decimal number : ");
        int n=Integer.parseInt(br.readLine());
        int r;
        String s=""; //variable for storing the result
        //array storing the digits (as characters) in a hexadecimal number system
        char dig[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(n>0)
            {
                r=n%16; //finding remainder by dividing the number by 16
                s=dig[r]+s; //adding the remainder to the result
                n=n/16;
            }
        System.out.println("Output = "+s);
    }
}