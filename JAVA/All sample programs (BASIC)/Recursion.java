import java.io.*;
class Recursion
{
int a,b,c;
Recursion()
{
a=0;
b=1;
c=a+b;
}
int input()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the limit of the fibonacci series :- ");
int x=Integer.parseInt(in.readLine());
return(x);
}
int fib(int n)
{
if(n==2)
return(a);
else
{
a=b;
b=a+b;
return(a+fib(--n));
}
}
void generate_fibseries(int x)
{
int i;
a=0;
b=1;
System.out.println("The fibonacci series is :- ");
System.out.println(a);
System.out.println(b);
for(i=0;i<(x-2);i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
return;
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Recursion ob=new Recursion();
int y=ob.input();
System.out.println("The nth term of the series is :- "+ob.fib(y));
ob.generate_fibseries(y);
}
}