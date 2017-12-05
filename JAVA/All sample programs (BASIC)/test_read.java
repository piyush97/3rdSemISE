import java.io.*;
class test_read
{
public static void main()throws IOException
{
FileReader f=new FileReader("student.SHR");
BufferedReader fi=new BufferedReader(f);
String text;
int i=0;
while((text=fi.readLine())!=null)
{
i++;
System.out.print("name\t"+i+"\t:\t");
System.out.println(text);
}
fi.close();
}
}