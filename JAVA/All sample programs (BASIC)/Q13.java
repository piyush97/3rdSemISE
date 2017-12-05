import java.io.*;
class Q13
{
    public static void main ()throws IOException
    {
        BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
        System.out.print("Enter the 1st String : ");
        String s1=br.readLine();
        int len1=s1.length();
        System.out.print("Enter the 2nd String : ");
        String s2=br.readLine();
        System.out.println("-------------------------------");
        System.out.println("Strings Before Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
        s1=s1+s2;
        s2=s1.substring(0,len1);
        s1=s1.substring(len1);
        System.out.println("-------------------------------");
        System.out.println("Strings After Swapping : ");
        System.out.println("1st String = "+s1);
        System.out.println("2nd String = "+s2);
    }
}