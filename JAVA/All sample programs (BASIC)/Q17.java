import java.io.*;
class Q17
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,b,max,min,x,lcm=1;
System.out.print("Enter the 1st number : ");
a=Integer.parseInt(br.readLine());
System.out.print("Enter the 2nd number : ");
b=Integer.parseInt(br.readLine());
if(a>b)
{
max=a;
min=b;
}
else
{
max=b;
min=a;
}
for(int i=1;i<=min;i++)
{
x=max*i;
if(x%min==0)
{
lcm=x;
break;
}
}
System.out.println("L.C.M. = "+lcm);
} }