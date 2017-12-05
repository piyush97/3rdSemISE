import java.io.*;
public class SaddlePoint
{
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 static int i,j,N,arr[][],a,p,h,m,k,flag=0,temp,min;
 void input()throws Exception
 {
     System.out.print("Enter the size of array : ");
     N=Integer.parseInt(br.readLine());
     arr=new int[N][N];
     for(i=0;i<N;i++)
     {  
         for(j=0;j<N;j++)
         {
             System.out.print("Enter element in cell :- "+(i+1)+":"+(j+1)+"-->");
             arr[i][j]=Integer.parseInt(br.readLine());
         }
     }
}
 
void findSaddle()
 {
     for(i=0;i<N;i++)
     {
         a=arr[i][0];p=0;
         for(j=0;j<N;j++)
          {   if(arr[i][j]<a)
               {
                   a=arr[i][j];
                   p=j;
               }
         }
         h=arr[0][p];m=0;
         for(k=0;k<N;k++)
            if(arr[k][p]>h)
            {
               h=arr[k][p];
               m=k;
            }
         if(a==h)
         {
           System.out.println("\nsaddle point = "+h);
           flag=1;
         }
     }
 }
 
 void diagonalsort()
  {  
      for(i=0;i<N-1;i++)
        {
            int min=i;
            for(j=(i+1);j<N;j++)
            {
                if(arr[j][j]<arr[min][min])
                min=j;
            }
            temp=arr[i][i];
            arr[i][i]=arr[min][min];
            arr[min][min]=temp;
        }
        System.out.println("Array after diagonal sort is ");
        for(i=0;i<N;i++)
        {
            for(j=0;j<N;j++)
            System.out.print(arr[i][j]+"\t");
            System.out.println();
        }
     }
 public static void main()throws Exception
 {
     SaddlePoint obj=new SaddlePoint();
     obj.input();
     System.out.println("\nOriginal Matrix :");
     for(i=0;i<N;i++)
     {  for(j=0;j<N;j++)
           System.out.print(arr[i][j]+"\t");
        System.out.println();
     }
     obj.findSaddle();
     if(flag==0)
       System.out.println("\nNo Saddle Point Found in Matrix");
       obj.diagonalsort();
 }
}