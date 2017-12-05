import java.io.*;
class mersenne_number
{
public static void main()throws IOException
{
int i;
long c,pwr;
System.out.println("Generated Mersenne numbers :- ");
for(i=1;i<20;i++)
{
c=(long)(Math.pow(2,i)-1);
System.out.print(c+" ");
}
System.out.println();
System.out.println("Generated double Mersenne numbers :- ");
for(i=1;i<=10;i++)
{
pwr=(long)Math.pow(2,i)-1;
c=(long)Math.pow(2,pwr)-1;
System.out.print(c+" ");
}
}
}