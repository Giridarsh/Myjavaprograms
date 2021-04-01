import java.io.*;
import java.lang.*;

class one
{  
      DataInputStream joe = new DataInputStream(System.in);
      one()
      {
            try
            {
	int firstnumber = Integer.parseInt(joe.readLine());
	System.out.println("Enter the first number : "+firstnumber);
	int secondnumber = Integer.parseInt(joe.readLine());
	System.out.println("Enter the second number : "+secondnumber);
	int result = firstnumber+secondnumber;
	System.out.println("Result is : "+result);
            }
            catch(Exception s) {}
      }
}

class twentyfive
{
      static public void main(String asd[])
      {
	one obj = new one();
      }
}
		
	

	
	      
	