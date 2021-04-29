interface Animal
{
      public void eat();
      public void sound();
}
interface Bird
{
      int numberOfLegs = 2;
      String outerCovering = "feather";
      public void fly();
}
class Eagle implements Animal, Bird
{
      public void eat()
      {
            System.out.println("Eats reptiles and amphibians.");
      }
      public void sound()
      {
            System.out.println("Has a whistling sound.");
      }
      public void fly()
      {
            System.out.println("Flies up to 10,000 feet.");
      }
}
class inter
{
      static public void main(String asd[])
      {
            Eagle obj = new Eagle();
            obj.eat();
            obj.sound();
            obj.fly();
            System.out.println("Number of legs : " + Bird.numberOfLegs);
            System.out.println("Outer covering : " + Bird.outerCovering);
      }
}