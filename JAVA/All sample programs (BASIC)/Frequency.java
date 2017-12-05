import java.io.*;
class Frequency
{
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String st;
int l,i,j,k=1,x=0;
char ch,ch1;
//Taking the word from the user
System.out.print("Enter the word :- ");
st=in.readLine();
//Converting it into lower case
st=st.toLowerCase();
l=st.length();
char c[]=new char[l];
//Storing the characters of the word in a character array
for(i=0;i<l;i++)
{
ch=st.charAt(i);
c[i]=ch;
}
//Sorting the character array
for(i=0;i<(l-1);i++)
for(j=(i+1);j<l;j++)
if((int)c[i]>(int)c[j])
{
ch1=c[i];
c[i]=c[j];
c[j]=ch1;
}
//Calculating and displaying the frequency of each character of the array
for(i=0;i<(l-1);i++)
{
if(c[i]==c[i+1])
{
k++;
x=1;
}
else
{
System.out.println(c[i]+" :- "+k);
k=1;
x=0;
}
}
if(x==0)
System.out.println(c[i]+" :- "+k);
}
}