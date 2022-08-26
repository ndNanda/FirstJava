import java.util.*;
class Fibonacci
{
   public static void main(String args[])
 {
    int a=0,b=1,c,i;
     Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
         int count = sc.nextInt();
     
     System.out.print(a+" "+b);
     for(i=1;i<=count;++i)
   
   {
        c=a+b;
       System.out.print(" "+c);
        a=b;
        b=c;
    }
  }
}