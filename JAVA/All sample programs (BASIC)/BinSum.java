import java.io.*;
class BinSum
{
//Function to find the sum of the two binary numbers
static String Sum(String b1,String b2)
{
int i;
char ch1,ch2,ch='0',c='0';
String s="";
for(i=7;i>=0;i--)
{
ch1=b1.charAt(i);
ch2=b2.charAt(i);
if((ch1=='0')&&(ch2=='0')&&(c=='0'))
ch='0';
else if(((ch1=='0')&&(ch2=='1')&&(c=='0'))||((ch1=='1')&&(ch2=='0')&&(c=='0'))||((ch1=='0')&&(ch2=='0')&&(c=='1')))
{
ch='1';
c='0';
}
else if(((ch1=='1')&&(ch2=='1')&&(c=='0'))||((ch1=='1')&&(ch2=='0')&&(c=='1'))||((ch1=='0')&&(ch2=='1')&&(c=='1')))
{
ch='0';
c='1';
}
else if((ch1=='1')&&(ch2=='1')&&(c=='1'))
{
ch='1';
c='1';
}
s=ch+s;
}
if(c=='1')
s=c+s;
return(s);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String s1,s2,bs;
char ch;
//Taking both binary numbers from the user
System.out.print("Enter the 1st eight bits binary number :- ");
s1=in.readLine();
System.out.print("Enter the 2nd eight bits binary number :- ");
s2=in.readLine();
bs=Sum(s1,s2);
//Checking whether the sum of the binary numbers contain an extra digit  and manipulating it
if(bs.length()!=8)
{
ch=bs.charAt(0);
bs=bs.substring(1);
String st="0000000";
st=st+ch;
bs=Sum(bs,st);
}
//Displaying the final result
System.out.println("Their sum is :- "+bs);
}
}