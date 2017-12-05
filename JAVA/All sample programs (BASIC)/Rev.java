import java.io.*;
class Rev
{
static String st,s="";
static int l;
static String Reverse(int a)
{
if(a==l)
return(s);
else
return(Reverse(++a)+st.charAt(--a)+s);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the string to be reversed :- ");
st=in.readLine();
l=st.length();
int x=0;
String str=Reverse(x);
System.out.println("The reversed string is :- "+str);
}
}