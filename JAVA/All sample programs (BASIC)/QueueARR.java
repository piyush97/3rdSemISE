import java.io.*;
class QueueARR
{
int x[],front,rear,size;
QueueARR(int s)
{
size=s;
x=new int[size];
front=-1;
rear=-1;
}
void Insert()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
if(rear==size-1)
{
System.out.println("Queue Overflow");
return;
}
System.out.print("Enter number in the Queue :- ");
x[++rear]=Integer.parseInt(in.readLine());
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
System.out.println("Number deleted :- "+x[front++]);
}
void Display()
{
for(int i=front;i<=rear;i++)
System.out.print(x[i]+" ");
System.out.println();
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.print("Enter size of Queue :- ");
QueueARR ob=new QueueARR(Integer.parseInt(in.readLine()));
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