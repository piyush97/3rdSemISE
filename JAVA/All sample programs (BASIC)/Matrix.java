import java.io.*;
class Matrix
{
int CheckUnique(int a)
{
int i,b=a,c=0,r,y=0;
for(i=0;i<10;i++)
{
b=a;
c=0;
while(b!=0)
{
r=b%10;
if(r==i)
c++;
b=b/10;
}
if(c>1)
y=1;
}
if((a<0)||(a%10==0))
y=1;
return(y);
}
public static void main(String args[])throws IOException
{
InputStreamReader read=new InputStreamReader(System.in);
BufferedReader in=new BufferedReader(read);
Matrix ob=new Matrix();
int n,i,j,rmin,cmax,sp=0,temp,k;
System.out.print("Enter the order of the matrix :- ");
n=Integer.parseInt(in.readLine());
if(n>=20)
{
System.out.println("Size Exceeded");
System.exit(0);
}
int m[][]=new int[n][n];
for(i=0;i<n;i++)
for(j=0;j<n;j++)
{
System.out.print("Enter the "+(i+1)+"X"+(j+1)+" th element of the matrix :- ");
m[i][j]=Integer.parseInt(in.readLine());
}
System.out.println("The original matrix is :- ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(m[i][j]<10)
System.out.print(m[i][j]+"   ");
else
System.out.print(m[i][j]+"  ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
cmax=0;
rmin=m[i][0];
for(j=0;j<n;j++)
{
if(cmax<m[j][i])
cmax=m[j][i];
if(rmin>m[i][j])
rmin=m[i][j];
}
if(cmax==rmin)
{
sp=cmax;
break;
}
}
if((sp!=0)&&(ob.CheckUnique(sp)==0))
System.out.println("Saddle point :- "+sp);
else
System.out.println("No saddle point");
for(i=0;i<n;i++)
{
temp=m[i][i];
for(j=0;j<i;j++)
{
if(temp<m[j][j])
{
for(k=i;k>j;k--)
m[k][k]=m[k-1][k-1];
m[k][k]=temp;
}
}
}
System.out.println("After sorting principal diagonal :- ");
for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(m[i][j]<10)
System.out.print(m[i][j]+"   ");
else
System.out.print(m[i][j]+"  ");
}
System.out.println();
}
}
}