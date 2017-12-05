import java.io.*;
class Q1
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int n,sum=0,c=0,j=0,i,k;
System.out.println("Enter number");
n=Integer.parseInt(in.readLine());
System.out.println("Consequtive number combinations are :-");
for(i=1;i<n;i++)
{
sum=i;
j=i+1;
while(sum<n)
{
sum=sum+j;
j++;
}
if(sum==n)
{
for(k=i;k<j;k++)
{
if(k==i)
System.out.print(k);
else
System.out.print("+"+k);
}
System.out.println();
}
} } }