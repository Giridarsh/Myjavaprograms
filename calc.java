import java.util.*;
import java.io.*;

class calc
{
       static public void main(String asd[])
      {     
            Scanner s = new Scanner(System.in);
            System.out.println("Enter any two numbers : ");
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("Enter an operator (+, -, *, /): ");
            char operator=s.next().charAt(0);
            int result=0;

            switch(operator)
            {
                  case '+':
                  result = a + b;
                  break;
                
                  case '-':
                  result = a - b;
                  break;

                  case '*':
                  result = a * b;
                  break;
 
                  case '/':
                  result = a / b;
                  break;
 
                  default:
                  System.out.print("Error ! Operator is not correct");
                  return;
             }
             System.out.println(a + " " + operator + " " + b + " = " + result);
      }       
}