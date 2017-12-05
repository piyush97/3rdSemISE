import java.io.*;
class linkedlist
{
    public static void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        sll ob=new sll();
        System.out.println("1.Insert\n2.Add at position\n3.Add at Begining\n4.Delete at position\n5.Delete at last\n6.Delete at Begining\n7.Display\n8.Exit");
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
                ob.addatpos();
                break;
                case 7:
                ob.display();
                break;
                case 4:
                ob.deleteatpos();
                break;
                case 5:
                ob.deleteatlast();
                break;
                case 8:
                System.out.println("program end");
                System.exit(0);
                break;
                case 3:
                ob.addatbeg();
                break;
                case 6:
                ob.deleteatbeg();
                break;
                default:
                System.out.println("Invalid key \nTry again");
            }
        }
    }
}
class sll
{
    node start,active,last;
    sll()
    {start=null;}
    void insert()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        if(start==null)
        {
            start=new node();
            System.out.print("Enter value :- ");
            start.n=Integer.parseInt(in.readLine());
            start.p=null;
            last=start;
        }
        else
        {
            active=new node();
            System.out.print("Enter value :- ");
            active.n=Integer.parseInt(in.readLine());
            active.p=null;
            last.p=active;
            last=active;
        }
    }
    void addatpos()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        node temp=new node();node before,after;
        int pos,i=1;
        System.out.print("Enter value :- ");
        temp.n=Integer.parseInt(in.readLine());
        System.out.print("Enter position :- ");
        pos=Integer.parseInt(in.readLine());
        before=start;
        while(i<pos-1)
        {
            before=before.p;
            ++i;
        }
        active=before.p;
        before.p=temp;
        temp.p=active;
    }
    void addatbeg()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        node newnode=new node();
        System.out.print("Enter value :- ");
        newnode.n=Integer.parseInt(in.readLine());
        newnode.p=start;
        start=newnode;
    }
    void deleteatbeg()
    {
        if(start==null)
        System.out.println("No list present");
        else
        start=start.p;
    }
    void deleteatpos()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        node before,after;
        int pos,i=1;
        System.out.print("Enter position :- ");
        pos=Integer.parseInt(in.readLine());
        before=start;
        while(i<pos-1)
        {
            before=before.p;
            ++i;
        }
        active=before.p;
        after=active.p;
        before.p=after;
    }
    void deleteatlast()
    {
        if(start==null)
        System.out.println("No list present");
        else
        {
        active=start;
        while(active.p!=last)
        {
            active=active.p;
        }
        active.p=null;
        last=active;
        }
    }
    void display()
    {
        if(start==null)
        System.out.println("No list present");
        else
        {
        active=start;
        while(active!=null)
        {
            System.out.print(" "+active.n);
            active=active.p;
        }
        System.out.println();
        }
    }
}