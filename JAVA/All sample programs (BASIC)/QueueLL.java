import java.io.*;
class Node
{
int n;
Node p;
}
class QueueLL
{
Node front,rear,active;
QueueLL()
{
front=null;
rear=null;
}
void Insert()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter number in the Queue :- ");
if(front==null)
{
front=new Node();
front.n=Integer.parseInt(in.readLine());
front.p=null;
rear=front;
return;
}
active=new Node();
active.n=Integer.parseInt(in.readLine());
active.p=null;
rear.p=active;
rear=active;
}
void Delete()
{
if(front==null)
{
System.out.println("Queue Underflow");
return;
}
active=front;
front=front.p;
System.out.println("Number deleted :- "+active.n);
active.p=null;
if(front==null)
System.out.println("Queue Empty");
}
void Display()
{
active=front;
System.out.println("The Queue is :- ");
while(active!=null)
{
System.out.print(active.n+"  ");
active=active.p;
}
System.out.println();
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
QueueLL ob=new QueueLL();
System.out.println("(1)-Insert  (2)-Delete  (3)-Display  (4)-Exit");
System.out.print("Enter your choice :- ");
int ch=Integer.parseInt(in.readLine());
while(ch!=4)
{
if(ch==1)
ob.Insert();
else if(ch==2)
ob.Delete();
else if(ch==3)
ob.Display();
else
System.out.println("Wrong choice");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
}
}
}