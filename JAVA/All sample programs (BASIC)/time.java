import java.io.*;
class time
{
int hr,min,sec;
time(int h,int m,int s)
{hr=h;min=m;sec=s;}
void add(time t1,time t2)
{
    hr=t1.hr+t2.hr;
    min=t1.min+t2.min;
    sec=t1.sec+t2.sec;
    if(sec>=60)
    {min++;sec=sec%60;}
    if(min>=60)
    {hr++;min=min%60;}
}
void output()
{System.out.println(hr+":"+min+":"+sec);}
public static void main()throws IOException
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter time T1 --> ");
    int hr1=Integer.parseInt(in.readLine());
    int min1=Integer.parseInt(in.readLine());
    int sec1=Integer.parseInt(in.readLine());
    time ob1=new time(hr1,min1,sec1);
    System.out.println("Enter time T2 --> ");
    int hr2=Integer.parseInt(in.readLine());
    int min2=Integer.parseInt(in.readLine());
    int sec2=Integer.parseInt(in.readLine());
    time ob2=new time(hr2,min2,sec2);
    time ob=new time(0,0,0);
    ob.add(ob1,ob2);
    ob1.output();
    ob2.output();
    ob.output();
}
}