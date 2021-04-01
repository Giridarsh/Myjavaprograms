class sample
{
	int x=30;
	public void data()
	{
		System.out.println(x<<2);
	}
	public void inte()
	{
		System.out.println(x>>2);
	}
	public void diff()
	{
		System.out.println(x&2);	
	}
	public void deff()
	{
		System.out.println(x|2);
	}
	public void abcd()
	{
		System.out.println(x+2);
	}
	public void main()
	{
		System.out.println(x-2);
	}
	public void mani()
	{
		System.out.println(x*2);
	}
	public void name()
	{
		System.out.println(x%2);
	}
	public void medi()
	{
		System.out.println(x/2);
	}
}


class operation 
{
	static public void main(String arc[])
	{
		sample obj1 = new sample();
		obj1.data();
		obj1.inte();
		obj1.diff();	
		obj1.deff();
		obj1.abcd();
		obj1.main();
		obj1.mani();
		obj1.name();
		obj1.medi();
	}
}
		