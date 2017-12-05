import java.io.*;
class Duplicate
{
public static void main(String agrs[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
String st,str="";
int l,i;
//Taking the word from the user
System.out.print("Enter the word :- ");
st=in.readLine();
l=st.length();
//Storing the first character of the word into new string
str=str+st.charAt(0);
for(i=0;i<(l-1);i++)
if(st.charAt(i)!=st.charAt(i+1))
//Adding a charcter of the word to the string if it is not equal to its previous character
str=str+st.charAt(i+1);
//Displaying the correct word
System.out.println("The correct word is :- "+str);
}
}