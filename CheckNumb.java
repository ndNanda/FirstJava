import java.util.Scanner;

class CheckNumb
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number :");
  int num=sc.nextInt();
  if(num>0)
  System.out.println("It is positive number");
  else if(num<0)
  System.out.println("It is negative number");
 } 
}