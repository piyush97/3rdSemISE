import java.io.*;
class Notes
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i,q,c=0;
int m[]={1000,500,100,50,20,10,5,2,1};
System.out.println("Enter the amount of rupees");
n=Integer.parseInt(in.readLine());
for(i=0;i<9;i++)
{
q=n/m[i];
if(q>0)
{
System.out.println(m[i]+" X "+q+" = "+(m[i]*q));
c=c+q;
n=n%m[i];
}
}
System.out.println("Total number of notes are:- "+c);
}
}