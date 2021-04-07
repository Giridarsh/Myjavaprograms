import java.util.*;
import java.io.*;

class calculator
{
       DataInputStream s = new DataInputStream(System.in);
       calculator()
      {     
             try
             {     
                   System.out.println("Enter any two numbers : ");
                   int a = Integer.parseInt(s.readLine());
                   int b = Integer.parseInt(s.readLine());
                   System.out.println("Enter an operator (+, -, *, /): ");
                   char operator=s.readLine().charAt(0);
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
            catch(Exception d) {}
      }       
}

class calc
{
      static public void main(String asd[])
      {
            calculator obj = new calculator();
      }
}