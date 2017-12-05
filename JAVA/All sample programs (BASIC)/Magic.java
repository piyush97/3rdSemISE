import java.io.*;
class Magic
{
int num[],n;
Magic(int nx)
{
n=nx;
num=new int[n];
for(int i=0;i<n;i++)
num[i]=0;
}
void Input_number()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the numbers in the array :- ");
for(int i=0;i<n;i++)
num[i]=Integer.parseInt(in.readLine());
}
void Find_print_magic()
{
int i,x,s=0,d;
for(i=0;i<n;i++)
{
x=num[i];
while(x/10!=0)
{
s=0;
while(x!=0)
{
d=x%10;
s=s+d;
x=x/10;
}
System.out.println("The magic numbers found are :- ");
if(s==1)
System.out.println(num[i]);
}
}
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Magic ob=new Magic(5);
ob.Input_number();
ob.Find_print_magic();
}
}