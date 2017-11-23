package javalab;
import java.util.*;

public class sort {
    public static void main(String [] args){
        int n,i,swap,j,k;
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter"+n+"intergers");
        for(i=0;i<n;i++){
        a[i] =sc.nextInt();}
        for(i=0;i<n;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    swap =  a[j];
                    a[j] = a[j+1];
                    a[j+1]= swap;
                   
                }
               
            }
        }
        System.out.println("sorted list");
        for(i=0;i<n;i++)
            System.out.printf("%d",a[i]);
     }

}
  











