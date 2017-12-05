import java.io.*;
class Case
{
static String st,s="";
static int l;
static String Change(int a)
{
if(a==l)
return(s);
else if(Character.isUpperCase(st.charAt(a)))
return(s+Character.toLowerCase(st.charAt(a++))+Change(a));
else
return(s+Character.toUpperCase(st.charAt(a++))+Change(a));
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the string :- ");
st=in.readLine();
l=st.length();
int x=0;
String str=Change(x);
System.out.println("The string after changing case is :- "+str);
}
}