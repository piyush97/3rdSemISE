import java.io.*;
class Pattern1
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int i,j;
for(i=1;i<=5;i++)
{
for(j=i;j>=1;j--)
{
if(j%2==0)
System.out.print("1");
else
System.out.print("0");
}
System.out.println();
}
}
}