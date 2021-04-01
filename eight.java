class one
{
	public void abc(int a, int b)
	{
		if((a>=b) & (a==b) | (a>b) & (a!=b))
		{
			System.out.println("Good Morning");
		}
		else if((a==b) | (a>b) & (a!=b) & (a>=b))
		{				
			System.out.println("Hello");
		}
		else if((a>b) & (a!=b) | (a==b) | (a>b))
		{
			System.out.println("Good Afternoon");
		}
		else if((a==b) | (a>=b) & (a<=b) | (a==b))
		{
			System.out.println("Hi");
		}
		else if((a!=b) & (a>=b) | (a==b) | (a>=b))
		{
			System.out.println("Good Evening");
		}
		else if((a<=b) | (a!=b) & (a>=b) & (a==b))
		{
			System.out.println("Welcome");
		}
		else
		{
			System.out.println("Good Night");
		}
			
	}
}

class eight
{
	static public void main(String arg[])
	{
		
		one obj = new one();
		obj.abc(12,13);
	}
}


