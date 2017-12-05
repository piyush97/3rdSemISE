import java.io.*;
class Rotation
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String num,st="";
int l,i,max=0;
System.out.print("Enter the number on which rotation is to be performed :- ");
num=in.readLine();
l=num.length();
int n[]=new int[l];
for(i=0;i<l;i++)
{
num=num.substring(1)+num.charAt(0);
n[i]=Integer.parseInt(num);
if(n[i]>max)
max=n[i];
}
System.out.println("The highest number obtained after the rotation of the given number is :- "+max);
}
}