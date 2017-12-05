import java.io.*;
class Q6
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter any string: ");
String s =br.readLine();
s=s.toLowerCase();
int l=s.length();
char a[]=new char[26];
int f[]=new int[26];
char c='a',ch;
for(int i=0; i<26; i++)
{a[i]=c;f[i]=0;c++;}
System.out.println("Output:");
System.out.println("==========================");
System.out.println("Alphabet\tFrequency");
System.out.println("==========================");
for(int i=0; i<26; i++)
{
for(int j=0; j<l; j++)
{ch=s.charAt(j);
if(ch==a[i])
f[i]++; }
} 
for(int i=0; i<26; i++)
{
if(f[i]!=0)
System.out.println("   "+a[i]+"\t\t    "+f[i]);
} } }