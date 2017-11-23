package javalab;

public class Festival {

public static void main(String[] arg){
    sweets c= new sweets(arg[0],arg[1],arg[2],arg[3],arg[4],arg[5],arg[6],arg[7],arg[8]);
    c.display();
     
    }
   
}
    class sweets{
    String s[] = new String[9];
        int i,j;
       
        final int n = 9;
        sweets(String a,String b,String c,String d,String e,String f,String g,String h,String k){
            s[0] = a;
            s[1] = b;
             s[2] = c;
            s[3] = d;
             s[4] = e;
            s[5] = f;
            s[6] = g;
            s[7] = h;
            s[8] = k;
        }
       
        void display(){
            int k=1;
            for(i=0;i<n;i++){
              System.out.println("day"+k+":"+"sweet "+s[i]);
              k++;
   
            }

}}


