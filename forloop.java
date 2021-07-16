class loop
{
    void table()
    {
        for(int a=3;a<=15;a++)
        {
            System.out.println("The loop goes upto : " +a);
        }
    }
}
class forloop
{
    public static void main(String args[])
    {
        loop obj = new loop();
        obj.table();
    }
}