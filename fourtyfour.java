class Flights
{
      void fly()
      {
            System.out.println("flying");
      }
}
class Indigo extends Flights
{
      void fly()
      {
            System.out.println("\nyou are flying in Indigo");
      }
}
class Airindia extends Flights
{
      void fly()
      {
            System.out.println("you are flying in Airindia");
      }
}
class fourtyfour
{
      static public void main(String asd[])
      {
            Flights f;
            f=new Indigo();
            f.fly();
            f=new Airindia();
            f.fly();
      }
}