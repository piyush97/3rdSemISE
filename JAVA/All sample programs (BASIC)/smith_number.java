import java.io.*;
class smith_number
{
static int extract(int x)
{
int r,sum=0;
while(x!=0)
{r=x%10;sum=sum+r;x=x/10;}
return (sum);
}
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int n,i=2,s=0,s1=0;
System.out.println("Enter the number to be checked");
n=Integer.parseInt(in.readLine());
s1=extract(n);
System.out.println("sum of digits of number = "+s1);
while(i<=n)
{
if(n%i==0)
{
s=s+extract(i);
n=n/i;
}
else
i++;
}
System.out.println("Sum of factors = "+s);
if(s==s1)
System.out.println("SMITH NUMBER");
else
System.out.println("NOT SMITH NUMBER");
}
}