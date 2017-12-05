import java.io.*;
class Q16
{
public static void main() throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter a Number : ");
int n=Integer.parseInt(br.readLine()); //Inputting the number
int sq=n*n; //finding the square of the number
String s=Integer.toString(sq); //converting the square into a String
if(sq<=9)
s="0"+s;
int l=s.length(); //finding the length (i.e. no. of digits in the square).
int mid=l/2; //finding the middle point
String left=s.substring(0,mid); //extracting the left digits from the square
String right=s.substring(mid); //extracting the right digits from the square
int x=Integer.parseInt(left); //converting the left String into Integer
int y=Integer.parseInt(right); //converting the right String into Integer
if(x+y == n) //if sum of left and right numbers is equal to the original number then it is a Kaprekar number
System.out.println(n+" is a Kaprekar Number");
else
System.out.println(n+" is Not a Kaprekar Number");
}
}