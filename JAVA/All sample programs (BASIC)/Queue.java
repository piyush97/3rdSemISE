import java.io.*;
class Queue
{
int x[],front,rear,size;
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Queue(int a)
{
size=a;
x=new int[size];
front=-1;
rear=-1;
}
void Insert()throws IOException
{
if(rear==size-1)
{
System.out.println("Queue Underflow");
return;
}
System.out.print("Enter number to be inserted :- ");
int n=Integer.parseInt(in.readLine());
x[++rear]=n;
if(front==-1)
front++;
}
void Delete()
{
if(front==size||front==-1)
{
System.out.println("Queue Underflow");
return;
}
System.out.println("Number deleted="+x[front++]);
}
void Display()
{
int i;
for(i=front;i<=rear;i++);
System.out.print(x[i]+" ");
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter size of Queue");
int r=Integer.parseInt(in.readLine());
Queue ob=new Queue(r);
int ch;
while(true)
{
System.out.println("----------MENU-------------");
System.out.println("Enter 1 to insert a number in Queue");
System.out.println("Enter 2 to delete a number from Queue");
System.out.println("Enter 3 to display elements of Queue");
System.out.println("Enter 4 to exit");
System.out.println("---------------------------");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
ob.Insert();
break;
case 2:
ob.Delete();
break;
case 3:
ob.Display();
break;
case 4:
System.exit(1);
break;
default:
System.out.println("Wrong choice entered");
}
}
}
}