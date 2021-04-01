import java.io.*;
import java.lang.*;

class one
{
      one()
      {
            DataInputStream ert = new DataInputStream(System.in);
            try
            {
	int p = Integer.valueOf(ert.readLine()).intValue();
	float q = Float.valueOf(ert.readLine()).floatValue();
	System.out.println("The Sum of Two Numbers is : ");
	System.out.println(p+q);
	double r = Double.valueOf(ert.readLine()).doubleValue();
	short s = Short.valueOf(ert.readLine()).shortValue();
	System.out.println("The Multiplication of Two Numbers is : ");
	System.out.println(r*s);
	long t = Long.valueOf(ert.readLine()).longValue();
	byte u = Byte.valueOf(ert.readLine()).byteValue();
	System.out.println("The Subtraction of Two Numbers is : ");
	System.out.println(t-u);
            }
      catch(Exception s) {}
      }
}


class twentythree
{
      static public void main(String asd[])
      {
	one obj = new one();
      }
}