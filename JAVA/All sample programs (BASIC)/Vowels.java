import java.io.*;
class Vowels
{
static String st;
static int l,c=0;
static int Count(int a)
{
if(a==l)
return(c);
else if(st.charAt(a)=='a'||st.charAt(a)=='e'||st.charAt(a)=='i'||st.charAt(a)=='o'||st.charAt(a)=='u'||st.charAt(a)=='A'||st.charAt(a)=='E'||st.charAt(a)=='I'||st.charAt(a)=='O'||st.charAt(a)=='U')
{
c++;
return(Count(++a));
}
else
return(Count(++a));
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter the string :- ");
st=in.readLine();
l=st.length();
int y=0;
int x=Count(y);
System.out.println("The number of vowels present in the string are :- "+x);
}
}