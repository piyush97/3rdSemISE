import java.io.*;
class book
{
String name,publisher,yearofpublishing;
double cost,vat;
int numberofpages,numberofcopies;
book()
{
numberofpages=0;
}
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter name of the book --> ");
name=in.readLine();
System.out.print("Enter publisher of the book --> ");
publisher=in.readLine();
System.out.print("Enter year of publishing of the book --> ");
yearofpublishing=in.readLine();
System.out.print("Enter cost of the book --> ");
cost=Double.parseDouble(in.readLine());
System.out.print("Enter number of pages of the book --> ");
numberofpages=Integer.parseInt(in.readLine());
System.out.print("Enter number of copies of the book --> ");
numberofcopies=Integer.parseInt(in.readLine());
System.out.print("Enter the rate of vat --> ");
vat=Double.parseDouble(in.readLine());
}
void calculate()
{
double sum,s;
s=cost*numberofcopies;
sum=((s*vat)/100)+s;
cost=sum;
}
void output()
{
System.out.println("Name of the book :- "+name);
System.out.println("Publisher of the book :- "+publisher);
System.out.println("Year of publishing of the book :- "+yearofpublishing);
System.out.println("Number of pages of the book :- "+numberofpages);
System.out.println("Number of copies of the book :- "+numberofcopies);
System.out.println("Total cost of the book(including vat) :- "+cost);
}
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
book ob=new book();
ob.input();
ob.calculate();
ob.output();
}
}