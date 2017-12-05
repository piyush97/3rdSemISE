import java.io.*;
class GCD
{
static int Compute(int a,int b)
{
if(b==0)
return(a);
else
return(Compute(b,a%b));
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the two numbers in descending order :- ");
int x=Integer.parseInt(in.readLine());
int y=Integer.parseInt(in.readLine());
int z=Compute(x,y);
System.out.println("The GCD of the two given numbers is :- "+z);
}
}
