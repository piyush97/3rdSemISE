import java.io.*;
class codex
{
public static void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
int i=0,l,b,c,x;
char cha,cha1,z;
char ch1[]=new char [26];
char ch2[]=new char [26];
char ch3[]=new char [26];
char ch4[]=new char [26];
System.out.println("Enter sentence to be coded");
String st=in.readLine();
// A to Z (capital alphabets)
i=0;
for(x=65;x<=90;x++)
{
ch1[i++]=(char)x;
}
// Z to A (reverse capital alphabets)
i=0;
for(x=90;x>=65;x--)
{
ch2[i++]=(char)x;
}
// a to z (small alphabets)
i=0;
for(x=97;x<=122;x++)
{
ch3[i++]=(char)x;
}
// z to a (reverse small alphabets)
i=0;
for(x=122;x>=97;x--)
{
ch4[i++]=(char)x;
}
l=st.length();
for(b=0;b<l;b++)
{
cha=st.charAt(b);
if(Character.isUpperCase(cha)==true && Character.isLetter(cha)== true)
{
for(c=0;c<26;c++)
{
if(cha==ch1[c])
{
z=ch2[c];
System.out.print(z);
}
}
}
else if(Character.isLowerCase(cha)==true && Character.isLetter(cha)== true)
{
for(c=0;c<26;c++)
{
if(cha==ch3[c])
{
z=ch4[c];
System.out.print(z);
}
}
}
else if(cha==' ')
{
System.out.print(" ");
}
else
System.out.print(cha);
}
}
}