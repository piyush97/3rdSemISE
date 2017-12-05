import java.io.*;
class Swapping
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String s1,s2;
int l;
//Taking both the strings from the user
System.out.print("Enter first string :- ");
s1=in.readLine();
l=s1.length();
System.out.print("Enter second string :- ");
s2=in.readLine();
//Swapping both the strings
s1=s1.concat(s2);
s2=s1.substring(0,l);
s1=s1.substring(l);
//Displaying the final result
System.out.println("First string is :- "+s1);
System.out.println("Second string is :- "+s2);
}
}