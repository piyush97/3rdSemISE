import java.io.*;
class Number
{
public static void main(String rgs[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,r;
System.out.print("Enter any number between 0 & 1000 :- ");
n=Integer.parseInt(in.readLine());
if((n<0)||(n>=1000))
{
System.out.println("Invalid Input");
System.exit(1);
}
String digit[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
String tens[]={"Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
String s[]={"Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
System.out.print("The given number in words is :- ");
if(n==0)
System.out.println("Zero");
else if(n<10)
System.out.println(digit[n-1]);
else if(n<20)
System.out.println(s[n-11]);
else if(n<100)
System.out.println(tens[n/10-1]+" "+digit[n%10-1]);
else
{
System.out.print(digit[n/100-1]+" Hundred ");
r=n%100;
if(r>0)
{
if(r<10)
System.out.println(digit[r-1]);
else if(r<20)
System.out.println(s[r-11]);
else if(r<100)
System.out.println(tens[r/10-1]+" "+digit[r%10-1]);
}
}
}
}