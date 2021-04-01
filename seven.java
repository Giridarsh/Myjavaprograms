class a
{
	public void b(int f, int g)
	{
		System.out.println(f+(g+f)-g-(f-g) + (g*(g-f)+f*(f+g)));
		System.out.println(g-(f-g)+f+(g+f) - (f*(f+g)-g*(g-f)));
		System.out.println(f*(f+g)-g*(g-f) + (g-(f-g)+f+(g+f)));
		System.out.println(g*(g-f)+f*(f+g) - (f+(g+f)-g-(f-g)));
		System.out.println(f<g);
	}
}


class seven
{
	static public void main(String wer[])
	{
		a obj = new a();
		obj.b(6,1);
	}
}	
