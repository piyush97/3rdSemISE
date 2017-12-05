import java.io.*;
class Spiral
{
static boolean CheckPrime(int x)
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
int n,i,j,a=2;
System.out.print("Enter the value of n :- ");
n=Integer.parseInt(in.readLine());
int m[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
while(CheckPrime(a)==true)
m[i][j]=a++;
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
System.out.print(m[i][j]+"\t");
System.out.println();
}
}
}