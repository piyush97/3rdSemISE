import java.io.*;
class Sentences
{
String Sort(String s)
{
String word="",temp,sent="";
int l,i,c=0,j=0;
char ch;
s=s+' ';
l=s.length();
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch==' ')
c++;
}
String w[]=new String[c];
for(i=0;i<l;i++)
{
ch=s.charAt(i);
if(ch==' ')
{
w[j++]=word;
word="";
}
else
word=word+ch;
}
for(i=0;i<(c-1);i++)
for(j=(i+1);j<c;j++)
if(w[i].compareTo(w[j])>1)
{
temp=w[i];
w[i]=w[j];
w[j]=temp;
}
for(i=0;i<(c-1);i++)
sent=sent+w[i]+' ';
sent=sent+w[c-1];
return(sent);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Sentences ob=new Sentences();
String st,str="",sen="",word="";
int l,i,c=0,k=0;
char ch,ch1;
System.out.println("Enter the paragraph of text in capital letters :- ");
st=in.readLine();
l=st.length();
for(i=0;i<l;i++)
{
ch=st.charAt(i);
if((ch=='.')||(ch==',')||(ch=='!')||(ch=='?'))
c++;
}
if(c<=5)
{
st=st+' ';
for(i=0;i<l;i++)
{
ch=st.charAt(i);
if((ch=='.')||(ch==',')||(ch=='?')||(ch=='!')&&(st.charAt(i+1)==' '))
{
sen=sen.trim();
str=str+ob.Sort(sen)+ch+' ';
sen="";
}
else
sen=sen+ch;
}
System.out.println("The new paragraph of text is :- ");
System.out.println(str);
l=l+1;
System.out.println("Words beginning with vowel  :- ");
for(i=0;i<l;i++)
{
ch=st.charAt(i);
if(ch==' ')
{
ch1=word.charAt(0);
if((ch1=='A')||(ch1=='E')||(ch1=='I')||(ch1=='O')||(ch1=='U'))
{
k=1;
System.out.println(word);
}
word="";
}
else if((ch=='.')||(ch==',')||(ch=='?')||(ch=='!'))
continue;
else
word=word+ch;
}
if(k==0)
System.out.println("Nil");
}
else
System.out.println("ERROR :- Too many sentences");
}
}