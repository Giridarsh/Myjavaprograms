class abc
{
    public void bad()
    {
        int a=10,b=20,c;
        c=a+b;
        System.out.println("The addition is : "+c);
    }
}
class logo
{
    public static void main(String args[])
    { 
        abc obj=new abc();
        obj.bad();
    }
}