class sample
{
	int x=100,y=4;
	public void fan()
	{
		System.out.println("Result = "+(x+=y));
	}
}


class two
{
	static public void main(String args[])
	{
		sample obj = new sample();
		obj.fan();
	}
}