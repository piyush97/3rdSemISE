import java.io.*;
class twin_prime
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int n,i,j,p=0,q=0;
System.out.print("Enter the value for the range \nn=");
n=Integer.parseInt(in.readLine());
i=n;j=n;
while(true)
{
if((check_prime(i)==true)&&(check_prime(i+2)==true))
{p=i;q=i+2;break;}
if((check_prime(j)==true)&&(check_prime(j-2)==true))
{p=j-2;q=j;break;}
if((check_prime(i-1)==true)&&(check_prime(i+1)==true))
{p=i-1;q=i+1;break;}
++i;--j;
}
System.out.println("The twin prime pair is ("+p+","+q+")");
}
static boolean check_prime(int x)
{
int i;
for(i=2;i<x;i++)
{
if(x%i==0)
return(false);
}
return(true);
}
}