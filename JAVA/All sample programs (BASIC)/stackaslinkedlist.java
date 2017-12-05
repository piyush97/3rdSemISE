import java.io.*;
class stackaslinkedlist
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
stack ob=new stack();
System.out.println("1.Insert\n2.Delete\n3.Display\n4.Exit");
while(true)
{
System.out.print("Enter key of operation :- ");
int c=Integer.parseInt(in.readLine());
switch(c)
{
case 1:
ob.push();
break;
case 2:
ob.pop();
break;
case 3:
ob.display();
break;
case 4:
System.out.println("program end");
System.exit(0);
default:
System.out.println("Invalid key \nTry again");
}
}
}
}
class stack
{
node top,active;
stack()
{
top=null;
}
void push()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
if(top==null)
{
top=new node();
System.out.print("Enter number :- ");
top.n=Integer.parseInt(in.readLine());
top.p=null;
}
else
{ active=new node();
System.out.print("Enter number :- ");
active.n=Integer.parseInt(in.readLine());
active.p=top;
top=active; }
}
void pop()
{
if(top==null)
System.out.println("Underflow");
else
{ active=top.p;
top=active;
System.out.println("Element poped"); }
}
void display()
{
if(top==null)
System.out.println("Stack is empty");
else
{
System.out.println("Elements are :- ");
active=top;
while(active!=null)
{
System.out.println(active.n);
active=active.p;
}
return;
}
}
}