import java.io.*;
class Print
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
FileReader fin=new FileReader("Print.java");
BufferedReader bin=new BufferedReader(fin);
String text;
while((text=bin.readLine())!=null)
{
System.out.println(text);
}
}
}