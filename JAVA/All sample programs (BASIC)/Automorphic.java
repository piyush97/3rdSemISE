import java.io.*;
class Automorphic
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,s,r,x=0,k=0,m=0;
System.out.print("Enter the number to be checked as automorphic number :- ");
n=Integer.parseInt(in.readLine());
s=n*n;
while(n!=0)
{
r=n%10;
m=m*10+r;
n=n/10;
}
while(s!=0)
{
r=s%10;
x=x*10+r;
if(x==m)
{
k=1;
break;
}
s=s/10;
}
if(k==1)
System.out.println("It is an automorphic number");
else
System.out.println("It is not an automorphic number");
}
}