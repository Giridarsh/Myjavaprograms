class non
{
	int x=2;
	public void greatdata()
	{
		System.out.println(x>2);
	}
	public void lessdata()
	{
		System.out.println(x<2);
	}
	public void greatequaldata()
	{
		System.out.println(x>=2);
	}
	public void lessequaldata()
	{
		System.out.println(x>=2);
	}
	public void equaldata()
	{
		System.out.println(x==2);
	}
	public void nonequaldata()
	{
		System.out.println(x!=2);
	}
}


class three
{
	static public void main(String asd[])
	{
		non obj1 = new non();			
		obj1.greatdata();
		obj1.lessdata();
		obj1.greatequaldata();
		obj1.lessequaldata();
		obj1.equaldata();
		obj1.nonequaldata();
		
	}
}