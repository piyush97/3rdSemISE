import java.io.*;
class Queueasarray
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
array ob=new array();
System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
while(true)
{
System.out.print("Enter key of operation :- ");
int c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
ob.insert();
break;
case 2:
ob.delete();
break;
case 3:
ob.display();
break;
case 4:
System.exit(0);
default:
System.out.println("Invalid key \nTry again");
}
}
}
}
class array
{
int rear,front;
int ar[]=new int[5];
array()
{
rear=front=-1;
}
void insert()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
if(rear+1>4)
System.out.println("Queue overflow ");
else
{
System.out.print("Enter element :- ");
ar[++rear]=Integer.parseInt(in.readLine());
}
if(front==-1)
front=0;
}
void delete()
{
if(front==-1)
System.out.println("Queue underflow");
else
System.out.println("Deleted element :- "+ar[front++]);
if(front>rear)
front=rear=-1;
}
void display()
{
if(front==-1)
System.out.println("Queue underflow");
else
{
System.out.println("Elements in Queue");
for(int i=front;i<=rear;i++)
{
System.out.println(ar[i]+"\t");
}
System.out.println();
}
}
}