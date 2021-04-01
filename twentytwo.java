import java.io.*;
import java.lang.*;

class one
{
      DataInputStream ore = new DataInputStream(System.in);
      one()
      {
	try
	{
	      System.out.println("Enter the value of d");
	      int d=Integer.parseInt(ore.readLine());
	      System.out.println(d);
	      System.out.println("Enter the value of e");
	      int e=Integer.parseInt(ore.readLine());
	      System.out.println(e);
	      System.out.println("The Result Is : "+d * +e);
	}
	catch(Exception s){}
      }
}

class twentytwo
{
      static public void main(String asd[])
      {
	one obj = new one();
      }
}