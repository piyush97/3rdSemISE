import java.util.*;
import java.io.*;
class Reverse
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
int n,i;
String s,st="",rev="";
//Taking the number of sentences from the user
System.out.print("Enter number of sentences you want to input :- ");
n=Integer.parseInt(in.readLine());
//Taking the sentences from the user and adding them
for(i=0;i<n;i++)
{
System.out.println("Enter sentence "+(i+1)+" :- ");
s=in.readLine();
st=st+s+" ";
}
//Creating an object of StringTokenizer
StringTokenizer ob=new StringTokenizer(st,"'.,;: ");
for(i=ob.countTokens();i>=1;i--)
//Adding the words of the sentences in new string in reverse order
rev=ob.nextToken()+" "+rev;
//Displaying the new string
System.out.println("The new string is :- ");
System.out.println(rev);
}
}