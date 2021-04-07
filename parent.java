class Vehicle
{
      private String make;
      private String model;
      private int year;
      Vehicle(String make, String model, int year)
     {
           this.make = make;
           this.model = model;
           this.year = year;
     }
      String getMake()
     {
           return make;
     }
     String getModel()
    {
           return model;
    } 
     int getYear()
    {
           return year;
    }
     void print()
    {
           System.out.println("Make: " + make + ", Model: " + model + ", Year: " +year);
     }
}
class Truck extends Vehicle
{
      private double tonnage;
      Truck(String make, String model, int year, double tonnage)
     {
           super(make, model, year);
           this.tonnage = tonnage;
     }
      double getTonnage()
     {
           return tonnage;
     }
     void print()
    {
           super.print();
           System.out.println("Tonnage: " + tonnage);
    }
}
Truck truck = new Truck("Ford", "F150", 2008, 0.5);
System.out.println("Make = " + truck.getMake());
System.out.println("Model = " + truck.getModel());
System.out.println("Year = " + truck.getYear());
System.out.println("Tonnage = " + truck.getTonnage());
truck.print();