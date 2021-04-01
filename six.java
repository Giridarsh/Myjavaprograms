class one
{
	int d=2,e=3,f=4,g=5,h=6,i=7,j=8,l=9,m=10,n=11,o=12,p=13,q=14,k=15;
	public void two()
	{
		System.out.println(d!=e);
		System.out.println(f+=g);
		System.out.println(h-=i);
		System.out.println(j==k);
		System.out.println(l++);
		System.out.println(m--);
		System.out.println(n*o);
		System.out.println(p/q);
	}
}


class six
{
	static public void main(String are[])
	{
		one obj = new one();
		obj.two();
	}
}