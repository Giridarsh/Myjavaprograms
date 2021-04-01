class sample
{
	int e=3, f=5;
	public void one()
	{
		if(e<f)
		{
		System.out.println("True");
         	}
         	else
         	{
		System.out.println("False");
         	}
}
    	public void two()
	{
		if(e>f)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public void three()
	{
		if(e<=f)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("True");
		}
	}
	public void four()
	{
		if(e>=f)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public void five()
	{
		if(e!=f)
		{
			System.out.println("True");
		}		
		else
		{
			System.out.println("False");
		}
	}
	public void six()
	{
		if(e==f)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}


class nine
{
	static public void main(String ade[])
	{
		sample obj = new sample();
		obj.one();
		obj.two();
		obj.three();
		obj.four();
		obj.five();
		obj.six();
	}
}






























