class one
{
      one()
      {
	int row=3,columns=5;
	if(row<10)
	{
	      System.out.println(row);
	      for(row=1;row<=columns+1;row++)
	      {
		System.out.println("");
	      }
	}
	else
	{
	      System.out.println(columns);
	}
      }
}

class twentyone
{
      static public void main(String asd[])
      {
	one obj = new one();
      }
}