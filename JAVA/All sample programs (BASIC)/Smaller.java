import java.io.*;
class Smaller
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,j,c=0,max=0,x=0;
System.out.print("Enter the size of the array :- ");
n=Integer.parseInt(in.readLine());
int m[]=new int[n];
System.out.println("Enter the array elements :-");
for(i=0;i<n;i++)
m[i]=Integer.parseInt(in.readLine());
for(i=0;i<n;i++)
{
c=0;
for(j=0;j<n;j++)
{
if(m[i]==m[j])
c++;
}
if(c>max)
{
max=c;
x=m[i];
}
else if((c==max)&&(m[i]<x))
{
max=c;
x=m[i];
}
}
System.out.println("The number with maximum frequency = "+max+" is :- "+x);
}
}