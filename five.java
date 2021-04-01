class one
{
	public void add(int a, int x)
	{
		System.out.println(a+x);
	}
	public void sub(int b, int y)
	{
		System.out.println(b-y);
	}
	public void mul(int c, int d)
	{
		System.out.println(c*d);
	}
	public void mod(int e, int f)
	{
		System.out.println(e%f);
	}
}


class five
{
	static public void main(String aer[])
	{
		one obj = new one();
		obj.add(4,2);
		obj.sub(7,2);
		obj.mul(2,4);
		obj.mod(5,10);
	}
}