import java.util.*;
public class KaamStringsKa {
    Scanner S=new Scanner(System.in);
    String ek;
    void getData()
    {
        System.out.println("Abbey ek string daal na");
        ek=S.nextLine();
        
    }
    void Sub()
    {
        System.out.println("Enter the starting and ending point for the substring you want");
        int start=S.nextInt();
        int end=S.nextInt();
        String SS=(ek.substring(start, end));
        System.out.println("New String  is: "+SS);
    }
    void Occur()
    {
        int count=0;
        System.out.println("Enter the text who's occurance u want to know");
        char text=S.next().charAt(0);
        
        char checkString[]=ek.toCharArray();
        for(int i=0;i<ek.length();i++)
        {
            if(checkString[i]==text)
            {
                count++;
            }
            
        }
        System.out.println("The occurence is "+count);
    }
    void replace()
    {
        System.out.println("enter the string to be replaced");
        String st1 = S.next();
        System.out.println("Enter the replacemnet");
        String rep=S.next();
        String newS=st1.replaceAll(st1, rep);
        System.out.println("New string is"+newS);
        
    }
    void alphaOrder()
    {
        System.out.println("enter the string to be sorted");
        String sortwali=S.nextLine();
        char Sort[]=sortwali.toCharArray();
        Arrays.sort(Sort);
        System.out.println("Sorted String is"+new String(Sort));
        
        
    }
    void compare()
    {
        System.out.println("enter the 2 string to be compared");
        String s1=S.next();
        String s2=S.next();
        int s3=s1.compareToIgnoreCase(s2);
        System.out.println("Comparision by"+s3);
        
        
        
    }
    void concat()
    {
        System.out.println("enter the 2 string to be concated");
        String s1=S.next();
        String s2=S.next();
        String s3=s1.concat(s2);
        System.out.println("Concatinated string is ye dekho!!! "+s3);
        
    }
    public static void main(String args[])
    {
        KaamStringsKa k=new KaamStringsKa();
        k.getData();
        k.Sub();
        k.Occur();
        k.alphaOrder();
        k.replace();
        k.compare();
        k.concat();
    }
}

