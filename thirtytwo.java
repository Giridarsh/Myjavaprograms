class example 
{    
    int x;
    int y;
    example(int x, int y) 
    { 
        this.x = x;
        this.y = y;
        System.out.println("Before passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
        add(this);
        System.out.println("After passing this to addTwo() method:");
        System.out.println("x = " + this.x + ", y = " + this.y);
    }
    public void add(example o)
    {
        o.x += 2;
        o.y += 2;
    }
}

class thirtytwo 
{
    public static void main( String[] args ) 
    {
        example obj = new example(1, -2);
    }
}