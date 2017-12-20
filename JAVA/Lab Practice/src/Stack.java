//stack
import java.util.*;
class Stack
{
    public int top,size;
   public int  stack[]=new int[40];

    Stack()
    {
           top=-1;

        size=40;
    }
    void push(int item)
    {
        if(top==size-1)
        {
            System.out.println("Stack is full");
            return;
        }
        else
        {
            stack[++top]=item;
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("Under Flow");
            return;
        }
        else
        {
            System.out.println("Item popped is"+stack[top--]);
        }
    }
    void display()
    {
        if(top==-1)
        {
            System.out.println("Under Flow");
            return;
        }
        else
            for(int i=0;i<top;i++)
            {
                System.out.println(stack[i]);
            }
    }
    public static void main(String[] args)
    {


        Stack S=new Stack();
        int choice=0;
        while(choice!=4)
        {
            System.out.println("Enter 1 for push 2 for pop and 3 for display");
            Scanner scan=new Scanner(System.in);
            choice=scan.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("ENter the number");
                    int num=scan.nextInt();
                    S.push(num);
                    break;
                case 2:
                    S.pop();
                    break;
                case 3:
                    S.display();
                    break;
            }
        }
    }
}