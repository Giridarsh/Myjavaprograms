import java.util.*;
import java.io.*;

class eight
{
      eight()
      {
         try
         {
             int a;
             float b;
             String c;
             DataInputStream d = new DataInputStream(System.in);
             System.out.println("Enter a string: ");
             int c = Integer.parseInt(d.readLine());
             System.out.println("Input String is: "+c);
             System.out.println("Enter an integer: ");
             a = Integer.parseInt(d.readLine());
             System.out.println("Input Integer is: "+a);
             System.out.println("Enter a float number: ");
             b = Integer.parseInt(d.readLine());
             System.out.println("Input Float number is: "+b);
         } catch(Exception s) {} 
      }
}

class twentyeight
{
      static public void main(String asd[])
      {
            eight obj = new eight();
      }
}