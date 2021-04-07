abstract class num
{
      abstract void sum();
}
class intesum extends num
{
      void sum()
      {
            int a=16,b=25,c;
            c = a+b;
            System.out.println("INT VALUE = " + c);
      }
}
class flosum extends num
{
      void sum()
      {
            float f1=12.00f,f2=24.00f,f3;
            f3 = f1+f2;
            System.out.println("FLOAT VALUE = " + f3);
      }
}
class fourty
{
      static public void main(String asd[])
      {
           num obj;
           obj=new intesum();
           obj.sum();
           obj=new flosum();
           obj.sum();
      }
}