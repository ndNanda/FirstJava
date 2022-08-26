import java.util.Scanner;

class TernaryOPEX
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
        int num ;
        System.out.println("Enter the number");
        num=sc.nextInt();
  String result = num>0 ? "Positive" : "Negative";
      System.out.println(num +" is "+ result);
  }
}