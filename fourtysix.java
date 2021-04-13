interface Vehical
{
      public void changeGear(int newValue);
      public void speedUp(int increment);
      public void applyBrakes(int decrement);
}
class Car implements Vehical
{
      int speed = 0;
      int gear = 1;
      void Gear(int Value)
      {
            gear = Value;
      }
      void Up(int increment)
      {
            speed = speed + increment; 
      }
      void Brakes(int decrement)
      {
            speed = speed - decrement;
       }
       void print()
      {
            System.out.println(" speed:" + speed + " gear:" + gear);
      }
}
class fourtysix
{
      static public void main(String asd[])
      {
            Car obj = new Car();
            obj.Gear();
            obj.Up();
            obj.Brakes();
            obj.print();
      }
} 	