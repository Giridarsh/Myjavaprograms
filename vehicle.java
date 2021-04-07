class Vehicle
{
      private String make,model;
      private int year;
      Vehicle(String make, String model, int year)
      {
           this.make = make;
           this.model = model;
           this.year = year;
      }
      public void getMake(String make)
      {
           return getMake; 
      }
      public void getModel(String model)
     {
           return getModel;
     } 
     public void getYear(int year)
     {
           return getYear;
     }
     public void print()
     {
           System.out.println("Make: " + make + ", Model: " + model + ", Year: " +year);
     }
}
class Car extends Vehicle
{
      double tonn;
      Car(String make, String model, int year, double tonn)
      {
           super(make, model, year);
           this.tonn = tonn;
      }
      public void getTonn(double tonn)
      {
           return getTonn;
      }
}

class vehicle
{
      static public void main(String asd[])
      {
            Car obj = new Car("Ford","Figo",2008,1.5);
            System.out.println("Make = "+obj.getMake());
            System.out.println("Model = "+obj.getModel());
            System.out.println("Year = "+obj.getYear());
            System.out.println("Tonn = "+obj.getTonn());
            obj.print();
      }
}
 