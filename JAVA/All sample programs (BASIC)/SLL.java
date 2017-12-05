import java.io.*;
class Node
{
int n;
Node p;
}
class SLL
{
Node start,active,last;
void CreateNode()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int ch=1;
start=new Node();
System.out.print("Enter the number in the node :-");
start.n=Integer.parseInt(in.readLine());
start.p=null;
last=start;
while(ch==1)
{
active=new Node();
System.out.print("Enter the number in the node :-");
active.n=Integer.parseInt(in.readLine());
active.p=null;
last.p=active;
last=active;
System.out.print("Enter 1 to continue :- ");
ch=Integer.parseInt(in.readLine());
}
return;
}
void AddAtBeginning()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
active=new Node();
System.out.print("Enter the number to be added at the beginning :-");
active.n=Integer.parseInt(in.readLine());
active.p=start;
start=active;
System.out.println("Number added at the beginning of the link list");
return;
}
void AddAtPosition()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int pos,i=1;
Node before,after;
active=new Node();
System.out.print("Enter the number to be inserted :- ");
active.n=Integer.parseInt(in.readLine());
System.out.print("Enter the position where the new node is to be inserted :- ");
pos=Integer.parseInt(in.readLine());
active.p=null;
before=start;
while(i<(pos-1))
{
before=before.p;
i++;
}
after=before.p;
before.p=active;
active.p=after;
System.out.println("Node added at the given position in the link list.");
return;
}
void DeleteFromBeginning()
{
active=start;
start=active.p;
active.p=null;
System.out.println("The beginning node is deleted");
return;
}
void DeleteFromPosition()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Node before=start;
int pos,i=1;
System.out.print("Enter the position from where the node is to be deleted :- ");
pos=Integer.parseInt(in.readLine());
while(i<(pos-1))
{
before=before.p;
i++;
}
active=before.p;
before.p=active.p;
active.p=null;
System.out.println("The node at the given position has been deleted.");
return;
}
void Display()
{
active=start;
System.out.println("The link list is :-");
while(active!=null)
{
System.out.println(active.n);
active=active.p;
}
return;
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
SLL ob=new SLL();
System.out.println("(1)-Create a node          (2)-Add at beginning      (3)-Add at position");
System.out.println("(4)-Delete from beginning  (5)-Delete from position  (6)-Display  (7)-Exit");
System.out.print("Enter your choice :- ");
int ch=Integer.parseInt(in.readLine());
while(ch!=7)
{
if(ch==1)
ob.CreateNode();
else if(ch==2)
ob.AddAtBeginning();
else if(ch==3)
ob.AddAtPosition();
else if(ch==4)
ob.DeleteFromBeginning();
else if(ch==5)
ob.DeleteFromPosition();
else if(ch==6)
ob.Display();
else
System.out.println("Wrong choice");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
}
}
}