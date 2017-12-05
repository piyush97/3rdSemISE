import java.io.*;
class Node
{
int n;
Node p;
}
class StackLL
{
Node top,active;
StackLL()
{
top=null;
}
void Push()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the number :- ");
if(top==null)
{
top=new Node();
top.n=Integer.parseInt(in.readLine());
top.p=null;
return;
}
active=new Node();
active.n=Integer.parseInt(in.readLine());
active.p=top;
top=active;
}
void Pop()
{
if(top==null)
{
System.out.println("Stack Underflow");
return;
}
active=top;
top=top.p;
System.out.println("Number popped :- "+active.n);
active.p=null;
if(top==null)
System.out.println("Stack Empty");
}
void Display()
{
System.out.println("The stack is :- ");
active=top;
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
StackLL ob=new StackLL();
System.out.println("(1)-Push  (2)-Pop  (3)-Display  (4)-Exit");
System.out.print("Enter your choice :- ");
int ch=Integer.parseInt(in.readLine());
while(ch!=4)
{
if(ch==1)
ob.Push();
else if(ch==2)
ob.Pop();
else if(ch==3)
ob.Display();
else
System.out.println("Wrong choice");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
}
}
}