import java.io.*;
class Perfect
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int a,b,i,s=0,c=0;
System.out.print("Enter the value of first limit :- ");
a=Integer.parseInt(in.readLine());
System.out.print("Enter the value of last limit :- ");
b=Integer.parseInt(in.readLine());
for(i=0;i<=b;i++)
{
s=i*i;
if((s>=a)&&(s<=b))
c++;
}
System.out.println("The number of perfect squares present between the two limits are :- "+c);
}
}