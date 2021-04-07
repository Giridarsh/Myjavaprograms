abstract class Vehicle
{
      private String _color;
      private String _model;
      Vehicle(String color, String model)
      {
            this._color = color;
            this._model = model;
      }
      abstract void drive();
      abstract void stop();
      abstract void park();
      void horn()
      {
            System.out.println("Peeeeeep\n");
      }
}
class Ship extends Vehicle
{
      public Ship(String color, String model)
      {
            super(color, model);
      }
      void drive()
      {
            System.out.println("Ship is moving");
      }
      void stop()
      {
            System.out.println("Ship is stopping");
      }
      void park()
      {
            System.out.println("Ship is docking");
      }
}
class Car extends Vehicle
{
      private int _doors;
      public Car(String color, String model, int doors)
      {
            super(color, model);
            this._doors = doors;
      }
      void drive()
      {
            System.out.println("Car is in drive mode");
      }
      void stop()
      {
            System.out.println("Car is in stop mode");
      }
      void park()
      {
            System.out.println("Car is in park mode");
      }
}

class fourtyone
{
      static public void main(String asd[])
      {
            Car obj = new Car("Black","Verna",4);
            obj.drive();
            obj.stop();
            obj.park();
            obj.horn();
            Ship obj1 = new Ship("White","Flyjet");
            obj1.drive();
            obj1.park();
            obj1.stop();
            obj1.horn();
      }
}