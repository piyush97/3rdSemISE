import java.io.*;
public class test1_read
{
public static void main()throws IOException
{
boolean EOF=false;
try
{
FileInputStream fr=new FileInputStream("student.SHR");
DataInputStream dr=new DataInputStream(fr);
while(!EOF)
{
try
{
String name,roll;float marks;int i;
name=dr.readUTF();
System.out.println("Name\t\t: "+name);
roll=dr.readUTF();
System.out.println("Roll no.\t: "+roll);
marks=dr.readFloat();
System.out.println("Marks\t\t: "+marks);
}
catch(EOFException el)
{
System.out.println("end of file");
EOF=true;
}
catch(IOException e)
{
System.err.println(e);
}
}
}
catch(FileNotFoundException e)
{
System.out.println("file not found");
}
}
}