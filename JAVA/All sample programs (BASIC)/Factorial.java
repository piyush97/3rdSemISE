import java.io.*;
class Factorial
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the number whose factorial is to be calculated :- ");
int x=Integer.parseInt(in.readLine());
int y=Factorial(x);
System.out.println("Factorial of the given number is :- "+y);
}
static int Factorial(int n)
{
if(n==0)
return(1);
else
return(n*Factorial(n-1));
}
}