class parents
{
      parents()
      {
            System.out.println("Constructor of Parent");
      }
      public void disp()
      {
            System.out.println("Parent Method");
      }
}

class child extends parents
{
      child()
      {
            System.out.println("Constructor of Child");
      }
      public void disp()
      {
            System.out.println("Child Method");
      }
}


class parent
{
      static public void main(String asd[])
      {
            child obj = new child;
            obj.disp();
      }
}
