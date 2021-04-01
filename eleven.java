// constructor return

class one
 {
    int g=99;
    public int two()
	{
	   g++;
	   return g;
	}
 }

 class eleven
 {
   public static void main(String asd[])
	{
	   one obj=new one();
	   int g=obj.two();
	   System.out.println("Return Value = "+g);

	}
 }