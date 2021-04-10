abstract class Shape
{
      private String colour="Red"; 
      Shape()
      {
            System.out.println("\nShape is called");
      }
      public String getColour()
      {
            return colour;
      }
      public void setColur(String c)
      {
            colour=c;
      }
      public String toString()
      {
            return("Colour is :"+ colour);
      }
      abstract double findArea();
}
class Square extends Shape
{
      private double a;
      public Square(double l)
      {
            a=l;
            System.out.println("Square  is called");
      }
      public String toString()
      {
            String str=super.toString();
            str=str+"\nShape is square";
            str=str+"\nArea is "+findArea();
            return str;
      }
      public double findArea()
      {
            return a*a;
      }
}

class fourtythree
{  
      static public void main(String asd[])
      {
            Square obj = new Square(5);
            System.out.println(obj.toString());
      }

}