import java.io.*;
class Extension
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String st,path,name,type;
int l,i,j;
System.out.print("Enter the string :- ");
st=in.readLine();
l=st.length();
i=st.LastIndexOf('\');
path=st.substring(0,(i+1));
j=st.IndexOf('.');
name=st.substring(i,(j+1));
type=st.substring(j);
System.out.println("Path :- "+path);
System.out.println("Name :- "+name);
System.out.println("Type :- "+type);
}
}