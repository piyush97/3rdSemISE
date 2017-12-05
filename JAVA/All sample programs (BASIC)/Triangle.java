import java.io.*;
class Triangle
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String st;
char ch;
int n,l,i,j;
System.out.println("Enter the word");
st=in.readLine();
System.out.println("Enter 1 for vertical triangle and 2 for horizontal triangle");
n=Integer.parseInt(in.readLine());
l=st.length();
switch(n)
{
case 1:
for(i=0;i<l;i++)
{
ch=st.charAt(i);
for(j=0;j<=i;j++)
System.out.print(ch+" ");
System.out.println();
}
break;
case 2:
for(i=0;i<l;i++)
{
for(j=0;j<(l-i);j++)
{
ch=st.charAt(j);
System.out.print(ch+" ");
}
System.out.println();
}
break;
default:
System.out.println("Wrong choice entered");
}
}
}
