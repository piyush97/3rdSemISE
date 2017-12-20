
package javalab;

import java.util.Scanner;

public class stack {
    static Scanner sc=new Scanner(System.in);

int a[]=new int[10];
int top;
stack(){
    top=-1;
}
void push(){
    if(top==9)
        System.out.println("stack is full\n");
    else{
    System.out.println("enter a element to insert\n");
    int n=sc.nextInt();
    top++;
    a[top]=n;
}
   
}
int pop(){
    int j=0;
    if(top==-1)
        System.out.println("stack is empty\n");
    else{
        j=a[top];
        top--;
       
    }
    return j;
}
void display(){
    int i;
    for(i=top;i>=0;i--)
        System.out.println(""+a[i]);
}
}
