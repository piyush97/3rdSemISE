import java.io.*;
class PrimeSpiral
{
boolean Prime(int x)
{
int i;
for(i=2;i<x;i++)
if(x%i==0)
return(false);
return(true);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
PrimeSpiral ob=new PrimeSpiral();
int n,m[][],i,j,x=2;
System.out.print("Enter the value of n :- ");
n=Integer.parseInt(in.readLine());
m=new int[n][n];
for(i=0;i<((n+1)/2);i++)
{
for(j=i;j<n-i;j++)
{
while(!ob.Prime(x))
x++;
m[i][j]=x++;
}
for(j=i+1;j<n-i;j++)
{
while(!ob.Prime(x))
x++;
m[j][n-i-1]=x++;
}
for(j=n-i-2;j>=i;j--)
{
while(!ob.Prime(x))
x++;
m[n-i-1][j]=x++;
}
for(j=n-i-2;j>=i+1;j--)
{
while(!ob.Prime(x))
x++;
m[j][i]=x++;
}
}
System.out.println("First "+(n*n)+" primes in spiral order are:- ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(m[i][j]+" ");
System.out.println();
}
}
}