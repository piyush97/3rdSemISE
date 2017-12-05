import java.io.*;
public class test1
{
static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
public static void main()
{
try
{
String name,roll;float marks;
FileOutputStream fw=new FileOutputStream("student.SHR");
DataOutputStream dw=new DataOutputStream(fw);
for(int i=0;i<10;i++)
{
System.out.print("Enter your name :- ");
name=in.readLine();
System.out.print("Enter your roll no. :- ");
roll=in.readLine();
System.out.print("Enter marks :- ");
marks=Float.parseFloat(in.readLine());
dw.writeUTF(name);
dw.writeUTF(roll);
dw.writeFloat(marks);
}
dw.close();
fw.close();
}
catch(IOException e)
{
System.err.println(e);
}
}
}