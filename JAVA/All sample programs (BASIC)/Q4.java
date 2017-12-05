import java.io.*;
class Q4
{
public static void main()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("Enter number of elements: "); // Inputting the number of elements
int n = Integer.parseInt(br.readLine()),t=0;
int A[]=new int[n]; //original array
int B[]=new int[n]; //array for storing the result
for(int i=0; i<n; i++)
{System.out.print("Enter Element "+(i+1)+": ");
A[i] = Integer.parseInt(br.readLine());}
for(int i=0; i<n-1; i++)
{
for(int j=i+1; j<n; j++)
{
if(A[i]>A[j])
{t=A[i];A[i]=A[j];A[j]=t;}
}
}
System.out.println("\nThe Sorted Array Is");
for(int i=0; i<n; i++)
{System.out.print(A[i]+"\t");}
int mid = (n-1)/2; //finding index of middle cell
int c = 1, lim = n-1-mid;
B[mid]=A[0]; //putting the minimum element in the middle cell
for(int i=1; i<=lim; i++)
{
if((mid+i)<n) //going to the right side
B[mid+i]=A[c++];
if((mid-i)>=0) //going to the left side
B[mid-i]=A[c++];
}
System.out.println("\n\nThe Result Is");
for(int i=0; i<n; i++)
{ System.out.print(B[i]+"\t");} } }