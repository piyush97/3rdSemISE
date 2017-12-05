import java.io.*;
//Creating the structure of class Node
class Node
{
int n;
Node p;
}
class SLL
{
Node start,active,last;
//Function to create linklist and add nodes to it
void Create()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int choice=1;
start=new Node();
System.out.println("Enter the number in the node :-");
start.n=Integer.parseInt(in.readLine());
start.p=null;
last=start;
while(choice==1)
{
active=new Node();
System.out.println("Enter the number in the node :-");
active.n=Integer.parseInt(in.readLine());
active.p=null;
last.p=active;
last=active;
System.out.print("Enter 1 to continue :- ");
choice=Integer.parseInt(in.readLine());
}
return;
}
//Function to add a node at the beginning of the linklist
void Addatbeg()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
active=new Node();
System.out.println("Enter the number to be added at the beginning :-");
active.n=Integer.parseInt(in.readLine());
active.p=start;
start=active;
System.out.println("Number added at the beginning of the link list");
return;
}
//Function to add a node at the end of the linklist
void Addatend()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
active=new Node();
System.out.println("Enter the number to be added at the end :-");
active.n=Integer.parseInt(in.readLine());
active.p=null;
last.p=active;
last=active;
System.out.println("Number added at the end of the link list");
return;
}
//Function to delete the starting node of the linklist
void Delatbeg()
{
active=start;
start=active.p;
active.p=null;
System.out.println("The beginning node is deleted");
return;
}
//Function to delete the last node of the linklist
void Delatend()
{
active=start;
while(active!=last)
{
if(active.p==last)
{
active.p=null;
last=active;
break;
}
else
active=active.p;
}
System.out.println("The ending node is deleted");
return;
}
//Function to search a given number in the linklist
void Search()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int s,c=1;
System.out.print("Enter the number to be searched in the link list :- ");
s=Integer.parseInt(in.readLine());
active=start;
while(active!=last)
{
if(s==active.n)
break;
else
{
active=active.p;
c++;
}
}
System.out.println("The given number is present at the "+c+"th node of the link list.");
return;
}
//Function to sort the linklist
void Sort()
{
Node active1;
int t;
for(active=start;active.p!=null;active=active.p)
{
for(active1=active.p;active1!=null;active1=active1.p)
{
if(active1.n<active.n)
{
t=active.n;
active.n=active1.n;
active1.n=t;
}
}
}
System.out.println("The link list has been sorted");
return;
}
//Function to add a node at the given position
void Addatpos()throws IOException
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
//Function to delete a node from the given position
void Delatpos()throws IOException
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
//Function to display the current linklist
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
}
class RunSLL
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
//Creating an object of the class SLL
SLL ob=new SLL();
int ch;
while(true)
{
System.out.println("--------------------MENU------------------");
System.out.println("Enter 1 to Create Linklist");
System.out.println("Enter 2 to Add node at beginning");
System.out.println("Enter 3 to Add node at the end");
System.out.println("Enter 4 to Delete the first node");
System.out.println("Enter 5 to Delete the last node");
System.out.println("Enter 6 to Search in the link list");
System.out.println("Enter 7 to Sort the link list");
System.out.println("Enter 8 to Add a node at given position");
System.out.println("Enter 9 to Delete a node at given position");
System.out.println("Enter 10 to Display the link list");
System.out.println("Enter 11 to exit");
System.out.println("------------------------------------------");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
ob.Create();
break;
case 2:
ob.Addatbeg();
break;
case 3:
ob.Addatend();
break;
case 4:
ob.Delatbeg();
break;
case 5:
ob.Delatend();
break;
case 6:
ob.Search();
break;
case 7:
ob.Sort();
break;
case 8:
ob.Addatpos();
break;
case 9:
ob.Delatpos();
break;
case 10:
ob.Display();
break;
case 11:
System.exit(0);
default:
System.out.println("Wrong choice entered");
}
}
}
}