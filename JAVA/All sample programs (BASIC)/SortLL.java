import java.io.*;
class Node
{
String c;
String cap;
Node p;
}
class SortLL
{
Node start,active,last;
void Create()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int choice=1;
start=new Node();
System.out.print("Enter the country name:- ");
start.c=in.readLine();
System.out.print("Enter its capital:- ");
start.cap=in.readLine();
start.p=null;
last=start;
while(choice==1)
{
active=new Node();
System.out.print("Enter the country name:- ");
active.c=in.readLine();
System.out.print("Enter its capital:- ");
active.cap=in.readLine();
last.p=active;
last=active;
System.out.print("Enter 1 to continue :- ");
choice=Integer.parseInt(in.readLine());
}
return;
}
void Sort()
{
Node active1,active2;
String temp;
for(active1=start;active1.p!=null;active1=active1.p)
{
for(active2=active1;active2!=null;active2=active2.p)
{
if(active1.c.compareTo(active2.c)>0)
{
temp=active1.c;
active1.c=active2.c;
active2.c=temp;
temp=active1.cap;
active1.cap=active2.cap;
active2.cap=temp;
}
}
}
return;
}
void Display()
{
active=start;
System.out.println("The sorted list is :-");
System.out.println("Country \t Capital");
while(active!=null)
{
System.out.println(active.c+" \t "+active.cap);
active=active.p;
}
return;
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
SortLL ob=new SortLL();
System.out.println("(1)-Create  (2)-Sort  (3)-Display  (4)-Exit");
System.out.print("Enter your choice :- ");
int ch=Integer.parseInt(in.readLine());
while(ch!=4)
{
if(ch==1)
ob.Create();
else if(ch==2)
ob.Sort();
else if(ch==3)
ob.Display();
else
System.out.println("Wrong choice");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
}
}
}