import java.io.*;
class Power
{
static int x;
static int Calculate(int n)
{
if(n==0)
return(1);
else
return(x*Calculate(n-1));
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the number :- ");
x=Integer.parseInt(in.readLine());
System.out.print("Enter the power of the number :- ");
int y=Integer.parseInt(in.readLine());
int z=Calculate(y);
System.out.println("The calculated value is :- "+z);
}
}