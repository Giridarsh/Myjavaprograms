class one 
{
	public void two(int x, int y)		//parameter is present inside a method class
	{	
		System.out.println(x<y);
	}
	public void three(int x, int y)	
	{	
		System.out.println(x>y);
	}
	public void five(int x, int y)	
	{	
		System.out.println(x<=y);
	}
	public void six(int x, int y)	
	{	
		System.out.println(x>=y);
	}
	public void seven(int x, int y)	
	{	
		System.out.println(x!=y);
	}
	public void eight(int x, int y)	
	{	
		System.out.println(x==y);
	}
	public void nine(int x, int y)
	{
		System.out.println()
	}
}

class four
{
	static public void main(String aee[])
	{
		one obj = new one();
		obj.two(19,34);
		obj.three(56,9);
		obj.five(33,55);
		obj.six(67,1);
		obj.seven(6,6);
		obj.eight(90,25);
	}
}
		