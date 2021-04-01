class one
{
	public void two()
	{	
		int i = 98, j = 23;
		System.out.println("Before swap\n");
        		System.out.println("First number = " + i);
        		System.out.println("Second number = " + j);
		int temporary = i;
		i = j;
		j = temporary;
		System.out.println("\nAfter swap\n");
        		System.out.println("First number = " + i);
        		System.out.println("Second number = " + j);
	}
}	


class swapnumbers 
{
	 static public void main(String[] aev)
	{
		one obj1 = new one();
		obj1.two();
    	}
}
