import java.io.*;
//Creating the structure of class Node
class Node
{
int n;
Node p;
}
class Stack
{
Node top,active;
//Constructor to initialize top to null
Stack()
{
top=null;
}
//Function to push a number into the stack
void Push()throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
System.out.println("Enter the number :- ");
if(top==null)
{
top=new Node();
top.n=Integer.parseInt(in.readLine());
}
else
{
active=new Node();
active.n=Integer.parseInt(in.readLine());
active.p=top;
top=active;
}
System.out.println("Number pushed");
return;
}
//Function to pop a number from the stack
void Pop()
{
if(top==null)
{
System.out.println("Stack Underflow");
return;
}
active=top;
top=active.p;
active.p=null;
System.out.println("Number popped");
if(top==null)
System.out.println("Stack is empty");
return;
}
//Function to display the stack
void Display()
{
System.out.println("The stack is :- ");
active=top;
while(active!=null)
{
System.out.println(active.n);
active=active.p;
}
return;
}
}
class RunStack
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
//Creating the object of the class Stack
Stack ob=new Stack();
int ch;
while(true)
{
System.out.println("-------MENU-------");
System.out.println("Enter 1 to Push");
System.out.println("Enter 2 to Pop");
System.out.println("Enter 3 to Display");
System.out.println("Enter 4 to Exit");
System.out.println("------------------");
System.out.print("Enter your choice :- ");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
ob.Push();
break;
case 2:
ob.Pop();
break;
case 3:
ob.Display();
break;
case 4:
System.exit(0);
default:
System.out.println("Wrong choice entered");
}
}
}
}