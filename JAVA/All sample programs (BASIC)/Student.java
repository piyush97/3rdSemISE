import java.io.*;
class Student
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
FileWriter fout=new FileWriter("Student.txt");
BufferedWriter bout=new BufferedWriter(fout);
PrintWriter pout=new PrintWriter(bout);
String name,text;
int marks,i,k=0;
//Taking name and marks of 10 students and storing them into Student.txt
System.out.println("Enter name of ten students and their marks :- ");
for(i=1;i<=10;i++)
{
System.out.print("Enter name "+i+" :- ");
name=in.readLine();
System.out.print("Enter marks :- ");
marks=Integer.parseInt(in.readLine());
pout.println(name);
pout.println(marks);
}
pout.close();
bout.close();
fout.close();
FileReader fin=new FileReader("Student.txt");
BufferedReader bin=new BufferedReader(fin);
//Taking the name to be searched from the user
System.out.print("Enter the name of the student you want to search :- ");
name=in.readLine();
//Searching the name and displaying the marks
while((text=bin.readLine())!=null)
{
if(text.equalsIgnoreCase(name))
{
System.out.println("Marks :- "+bin.readLine());
k=1;
break;
}
}
//Displaying error message if name not found
if(k==0)
System.out.println("Entered name not found");
bin.close();
fin.close();
}
}