import java.util.*;
class Largest{
 public static void main (String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the 1st number");
       int a =sc.nextInt();
  System.out.println("enter the 2nd number");
       int b =sc.nextInt();
  System.out.println("enter the 3rd number");
       int c =sc.nextInt();
  if(a>b&&a>c)
  System.out.println("a is the largest number");
  else if(b>a&&b>c) 
  System.out.println("b is the largest number");
  else if(c>a&&c>b)
  System.out.println("c is the largest number");
  else if(a==b&&b==c)
  System.out.println("All are equal");
  else if(a==b&&a>c)
  System.out.println("b and a are equal and c is smaller");
  else if(a==b&&a<c)
  System.out.println("b and a are equal and c is Larger");
  else if(a==c&&a>b)
  System.out.println("a and c are equal and b is smaller");
  else if(a==c&&a<b)
  System.out.println("a and c are equal and b is Larger");
  else if(b==c&&b>a)
  System.out.println("b and c are equal and a is smaller");
  else 
  System.out.println("b and c are equal and a is Larger");
  
  }
}
