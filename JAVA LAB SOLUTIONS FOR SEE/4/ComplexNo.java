package javalab;

import java.util.*;
public class ComplexNo {
static Scanner scan = new Scanner(System.in);
int a1,a2;
ComplexNo()
{
    a1=2;
    a2=3;
}
    public static void main(String[] args) {   
    int choice;
    ComplexNo a = new ComplexNo();
    System.out.println("real part of first number:");
    System.out.println(a.a1);
    System.out.println("real part of second number:");
    System.out.println(a.a2);
    System.out.println("enter the imaginary part of first number:");
    int b1 = scan.nextInt();
    System.out.println("enter the imaginary part of second number:");
    int b2 = scan.nextInt();
    System.out.println("your first complex no:"+a.a1+"+i"+b1);
    System.out.println("your second complex no:"+a.a2+"+i"+b2);
    do{
        System.out.println("1.add\n2.substract\n3.multiply");
        choice =scan.nextInt();
        switch(choice)
        {
        case 1:System.out.println("result:"+(a.a1+a.a2)+"+"+"("+(b1+b2)+")"+"i");
                            break;
        case 2:System.out.println("result:"+(a.a1-a.a2)+"+"+"("+(b1-b2)+")"+"i");
                            break;
        case 3:System.out.println("result:"+((a.a1*a.a2)-b1*b2)+"+"+"("+((b1*a.a2)+(b2*a.a1))+")"+"i");
                            break;
        default:System.out.println("wrong choice.");
        }
    } while(choice>0 && choice<4);
   
}

}

