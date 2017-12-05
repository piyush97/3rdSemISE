import java.io.*;
class Flames
{
static String DelCommon(String s1,String s2)
{
int l1,l2,i=0,j=0;
char ch1,ch2;
String s="";
l1=s1.length();
l2=s2.length();
while(i!=l1)
{
ch1=s1.charAt(i);
for(j=i;j<l2;j++)
{
ch2=s2.charAt(j);
if(ch1==ch2)
break;
s=s+ch2;
}
i++;
}
return(s);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String n1,n2,r1,r2;
System.out.println("Enter first name in lower case:-");
n1=in.readLine();
System.out.println("Enter second name in lower case :-");
n2=in.readLine();
n1.length();
n2.length();
r1=DelCommon(n1,n2);
r2=DelCommon(n2,n1);
System.out.println(r2);
System.out.println(r1);
}
}