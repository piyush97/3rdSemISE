import java.io.*;
class ISBN
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String code,ch;
int x=10,sum=0,i;
System.out.print("Enter the 10-digit ISBN number :- ");
code=in.readLine();
if(code.length()!=10)
{
System.out.println("Invalid Input");
System.exit(0);
}
for(i=0;i<10;i++)
{
ch=code.substring(i,i+1);
sum=sum+((!ch.equals("X"))?Integer.parseInt(ch)*(x--):10);
}
System.out.println("Sum="+sum);
if(sum%11==0)
System.out.println("Leaves no remainder-Valid ISBN");
else
System.out.println("Leaves remainder-Invalid ISBN");
}
}