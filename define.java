class ro 
{
	public void main()
	{
		int a=8,b=7;
		if(a!=b)
		{
			System.out.println(a!=b);
		}
		else
		{
			System.out.println("True");
		}
	}
	public void teach()
	{
		int c=4,d=9;
		if(c>d)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println(c>d);
		}
	}
}
class plan extends ro
{
	public void dream()
	{
		int e=7,f=3,g,u;
		g=e++;
		u=f--;
		System.out.println(+g);
		System.out.println(+u);	
	}
	public void name()
	{
		int h=0,i=6,j,v;
		j=++h;
		v=--i;
		System.out.println(+j);
		System.out.println(+v);
		super.teach();
	}
}
class nmap extends plan
{
	public void net()
	{
		int k=4,l=9,m;
		m=k&l;
		System.out.println(+m);
		super.dream();
	}
	public void game()
	{
		int m=3,o=34,p;
		p=m^o;
		System.out.println(+p);
	}
}
class phone extends nmap
{
	public void ringtone()
	{
		int q=5,r=9;
		if(q==r)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println(q==r);
		}
	}
	public void wallpaper()
	{
		int s=3,t=8;
		if(s<=t)
		{
			System.out.println(s<=t);
		}
		else
		{
			System.out.println("True");
			super.game();
		}
	}
	public void keys()
	{
		int x=43;
		if(x < 5 || x < 4)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println(x < 5 || x < 4);
		}
	}	
}



class define
{
	static public void main(String giri[])
	{
		ro obj = new ro();
		obj.main();	
		obj.teach();
		plan obj1 = new plan();
		obj1.dream();
		obj1.name();
		nmap obj2 = new nmap();
		obj2.net();
		obj2.game();
		phone obj3 = new phone();
		obj3.ringtone();
		obj3.wallpaper();
		obj3.keys();
		
	}
}