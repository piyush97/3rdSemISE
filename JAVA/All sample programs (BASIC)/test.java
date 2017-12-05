import java.io.*;
class test
{
static String name=("student.SHR");
static BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
public static void main()throws IOException
{
FileWriter fout=new FileWriter("student.SHR");
BufferedWriter bout=new BufferedWriter(fout);
PrintWriter pout=new PrintWriter(bout);
int i;
for(i=0;i<=10;i++)
{
System.out.print("Enter name :- ");
name=in.readLine();
pout.println(name);
}
pout.close();
bout.close();
fout.close();
}
}