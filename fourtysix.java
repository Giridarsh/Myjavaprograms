interface Vehicle
{
      public void Gear(int newValue);
      public void Speed(int increment);
      public void Brakes(int decrement);
}
class Car implements Vehicle
{
      int speed = 0;
      int gear = 1;
      public void Gear(int Value)
      {
            gear = Value;
      }
      public void Speed(int increment)
      {
            speed = speed + increment; 
      }
      public void Brakes(int decrement)
      {
            speed = speed - decrement;
       }
       public void print()
      {
            System.out.println(" speed : " + speed + " gear  : " + gear);
      }
}
class fourtysix
{
      static public void main(String asd[])
      {
            Car obj = new Car();
            obj.Gear(3);
            obj.Speed(50);
            obj.Brakes(2);
            obj.print();
      }
} 	