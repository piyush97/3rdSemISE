import java.io.*;
class Lt
{
public static void main()throws IOException
{
    BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
    int i,j,n;
    System.out.print("Enter the size of matrix :- ");
    n=Integer.parseInt(in.readLine());
    int a[][]=new int[n][n];
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            System.out.print("Enter the value in cell "+(i+1)+" : "+(j+1)+" :- ");
            a[i][j]=Integer.parseInt(in.readLine());
        }
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i>j || i==j)
            System.out.print(a[i][j]+"\t");
        }
        System.out.println("");
    }
}
}