import java.util.Scanner;
import java.io.*;
import java.lang.*;

class one
{
      one()
      {
      try
      {
      	Scanner sc = new Scanner(System.in);
      	System.out.println("Enter the value of the first number :");
      	int a = sc.nextInt();
      	System.out.println("Enter the value of the second number :");
      	int b = sc.nextInt();
      	int result = a*b;
      	System.out.println("Product of the given two numbers is : "+result);
      }
      catch(Exception d) {}
   }
}

class twentyfour
{
      static public void main(String asd[])
      {
	one obj = new one();
      }
}