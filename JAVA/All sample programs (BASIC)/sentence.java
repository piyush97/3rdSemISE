import java.io.*;
import java.util.*;
class sentence
{
String st,st1;
int i,j,k,len,x=0,y=0,z=0;
public void take()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
String arr[]=new String[10];
String arr1[]=new String[10];
String vowel[]=new String[200];
System.out.println("Enter paragraph");
st=in.readLine();
st=st.substring(0,st.length()-1);
StringTokenizer s=new StringTokenizer(st,"!?",true);
while(s.hasMoreTokens())
{
arr[x++]=s.nextToken();
}
for(i=0;i<x;i++)
{
st=arr[i];
s=new StringTokenizer(st," ");
y=0;
while(s.hasMoreTokens())
{
arr1[y++]=s.nextToken();
}
for(j=0;j<y-1;j++)
{
for(k=j+1;k<y;k++)
{
if(arr1[j].compareTo(arr1[k])>0)
{
st1=arr1[j];
arr1[j]=arr1[k];
arr1[k]=st1;
}
}
}
for(j=0;j<y;j++)
{
vowel[z++]=arr1[j];
System.out.print(" "+arr1[j]);
}
y=0;
}
System.out.println(".");
System.out.println("\nword starting with Vowels:");
for(j=0;j<z;j++)
{
st=vowel[j].trim().toUpperCase();
if(st.charAt(0)=='A'||st.charAt(0)=='E'||st.charAt(0)=='I'||st.charAt(0)=='O'||st.charAt(0)=='U')
System.out.println(vowel[j]+" ");
}
}
public static void main()throws IOException
{
sentence ob=new sentence();
ob.take();
}
}