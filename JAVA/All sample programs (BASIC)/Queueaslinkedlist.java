import java.io.*;
class Queueaslinkedlist
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
linkedlist1 ll=new linkedlist1();
System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
while(true)
{
System.out.print("Enter the key of the operation :- ");
int c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
ll.insert();
break;
case 2:
int temp=ll.delete();
if(temp!=0)
System.out.println("Element deleted is ["+temp+"]");
break;
case 3:
ll.display();
break;
case 4:
System.exit(0);
default:
System.out.println("You have entered invalid key. \nTry again");
}
}
}
}
class linkedlist1
{
node front,rear,active;
public linkedlist1()
{
front=null;
rear=null;
}
void insert()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
active=new node();
System.out.print("Enter element :- ");
active.n=Integer.parseInt(in.readLine());
active.p=null;
if(rear==null)
{
front=rear=active;
}
else
{
rear.p=active;
rear=active;
}
}
public int delete()
{
if(front==null)
{
System.out.println("Queue is empty");
return 0;
}
else
{
int temp=front.n;
front=front.p;
return temp;
}
}
public void display()
{
if(front==null)
{
System.out.println("Queue is empty");
}
else
{
System.out.println("Elements in the Queue");
node active=front;
while(active!=null)
{
System.out.println("["+active.n+"]");
active=active.p;
}
System.out.println("");
}
}
}