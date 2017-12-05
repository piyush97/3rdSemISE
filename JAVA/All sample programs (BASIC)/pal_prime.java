import java.io.*;
class pal_prime
{ public static void main()throws IOException
{ BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the size of array");
int n=Integer.parseInt(in.readLine());
int a[][]=new int [n][n];
int k,p,l,d,m,j,r=0,c=0,i;
for(k=2;k>=2;k++)
{ p=0;l=k;
while(l>0)
{ d=l%10;
p=p*10+d;
l=l/10; }
if(k==p)
{ m=0;
for(j=2;j<=k;j++)
{ if(k%j!=0)
m++; }
if(m!=0)
{ a[r][c]=k;
c++;
if(c==n)
{r++;c=0;}
if(r==n)
break;
} } }
System.out.println("original matrix:-");
for(i=0;i<n;i++)
{ for(j=0;j<n;j++)
System.out.print(a[i][j]+"\t");
System.out.println(); }
System.out.println("Transpose matrix:-");
for(i=0;i<n;i++)
{ for(j=0;j<n;j++)
System.out.print(a[j][i]+"\t");
System.out.println();
} } }