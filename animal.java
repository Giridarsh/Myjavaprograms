class animals
{
      animals()
      {
 	public void eat()
    	{
		System.out.println("\nAnimals\n");
        		System.out.println("eat");

  	}
	public void prey()
	{
		System.out.println("prey");
	}
    	public void sleep()
    	{
        		System.out.println("sleep\n");
    	}
      }
}
class bird extends animals
{
      birds()
      {
	public void fly()
    	{
		System.out.println("\nBirds\n");
        		System.out.println("fly");
	}
	public void egg()
	{
		System.out.println("lay eggs");		
	}
	public void sleep()
    	{
        		System.out.println("sleep");
    	}
      }
}
class fish extends bird
{
      fish()
      {
	public void eat()
	{
		System.out.println("\nFish\n");
		System.out.println("eat");
	}
	public void swim()
	{
		System.out.println("swim");
	}
	public void egg()
	{
		super.prey();
		System.out.println("lay eggs");
	}
	public void birth()
	{
		System.out.println("give birth to babies");
	}
      }
}


class animal
{
 	public static void main(String[] args)
	{
        		animals a =new animals();
        		bird b = new bird();
		fish c = new fish();
        		a.eat();
		a.prey();
        		a.sleep();
        		b.fly();
		b.egg();
		b.sleep();
		c.eat();
		c.swim();
		c.egg();
		c.birth();
    	}
}