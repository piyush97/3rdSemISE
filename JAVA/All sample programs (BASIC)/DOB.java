import java.io.*;
class DOB
{
int d,m,y;
DOB(int dd,int mm,int yy)
{d=dd;m=mm;y=yy;}
void diff(DOB son,DOB father)
{
if(son.d>father.d)
d=son.d-father.d;
else
{
son.m-=1;
son.d+=30;
d=son.d-father.d;
}
if(son.m>father.m)
{
m=son.m-father.m;
}
else
{
son.y-=1;
son.m+=12;
m=son.m-father.m;
}
y=son.y-father.y;
}
void output()
{
System.out.println(d+"-"+m+"-"+y);
}
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter date of birth of son");
int d1=Integer.parseInt(in.readLine());
int m1=Integer.parseInt(in.readLine());
int y1=Integer.parseInt(in.readLine());
DOB ob1=new DOB(d1,m1,y1);
System.out.println("Enter date of birth of your father");
int d2=Integer.parseInt(in.readLine());
int m2=Integer.parseInt(in.readLine());
int y2=Integer.parseInt(in.readLine());
DOB ob2=new DOB(d2,m2,y2);
DOB ob=new DOB(0,0,0);
ob1.output();
ob2.output();
ob.diff(ob1,ob2);
ob.output();
}
}