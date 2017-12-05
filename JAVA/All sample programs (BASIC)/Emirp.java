import java.io.*;
class Emirp
{
int n,rev,f;
Emirp(int nn)
{
n=nn;
rev=0;
f=2;
}
int isPrime(int x)
{
int i,k=0;
for(i=2;i<x;i++)
if(x%i==0)
{
k=1;
break;
}
return(k);
}
void isEmirp()
{
int m=n;
while(n!=0)
{
f=n%10;
rev=rev*10+f;
n=n/10;
}
if((isPrime(m)==0)&&(isPrime(rev)==0))
System.out.println("It is an Emirp number");
else
System.out.println("It is not an Emirp number");
return;
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the number :- ");
int m=Integer.parseInt(in.readLine());
Emirp ob=new Emirp(m);
ob.isEmirp();
}
}