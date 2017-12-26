package javalab;

import java.util.*;
public class Fibonacci {

    public static void main(String[] args) {
        int i,no, first=0, second=1, next;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of terms for Series: ");
        no=s.nextInt();
        first=0;
        second=1;
        System.out.println("Fibonacci series are: ");
         for(i=0; i<no; i++)
         {
          System.out.println(first);
          next = first + second;
          first = second;
          second = next;
          }
        System.out.println("Enter the number of terms for recursion program");
        int n=s.nextInt();
        int res=fibno(n);
        System.out.println(res);

       
    }
    //using recursion
    int fibno(int num)
    {
      if(num==1||num==2)
      {
        return 1;
      }
      else
      {
        return fibno(num)+fibno(num-1);
      }
    }

}
