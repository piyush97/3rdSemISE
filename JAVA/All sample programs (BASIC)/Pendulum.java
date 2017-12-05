import java.io.*;
class Pendulum
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new Bufferedreader(read);
int n,i,j,t,min,x;
System.out.print("Enter the number of integers you want to input :- ");
n=Integer.parseInt(in.readLine());
int m[]=new int[n];
System.out.println("Enter the integers :- ");
for(i=0;i<n;i++)
m[i]=Integer.parseInt(in.readLine());
for(i=0;i<(n-1);i++)
for(j=(i+1);j<n;j++)
if(m[j]<m[i])
{
t=m[i];
m[i]=m[j];
m[j]=t;
}
min=m[0];
x=n/2;
for(i=0;i<n;i++)
{
if(m[i]==min)
{
t=m[i];
m[i]=m[n/2];
m[n/2]=t;
}
else
{
t=m[i];
m[i]=m[++x];
m[x]=t;
}