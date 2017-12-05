import java.io.*;
class Q12
{
public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        int n=Integer.parseInt(br.readLine());
        String s=Integer.toString(n); //converting the number into String form
        int l=s.length();
        int flag=0;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j)) //if any digits match, then we know it is not a Unique Number
                {
                    flag=1;
                    break;
                }
            }
        }
        if(flag==0)
        System.out.println("**** The Number is a Unique Number ****");
        else
        System.out.println("**** The Number is Not a Unique Number ****");
    }
}