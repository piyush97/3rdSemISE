import java.util.Scanner;
public class diagonal_sort_matrix
{
    public static void sort()
    {
        int i,j,k,l,temp;
        int m[][] = new int[4][4];
        Scanner s=new Scanner(System.in);
        System.out.println("Enter an Array: ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("Enter the element in cell "+(i+1)+":"+(j+1)+"::");
                m[i][j]=s.nextInt();
            }
        }
                System.out.println("Original matrix is :- ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            System.out.print(m[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<3;i++)
        {
            int min=i;
            for(j=(i+1);j<4;j++)
            {
                if(m[j][j]<m[min][min])
                min=j;
            }
            temp=m[i][i];
            m[i][i]=m[min][min];
            m[min][min]=temp;
        }
        System.out.println("Array is ");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
}