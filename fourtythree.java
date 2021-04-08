abstract class Shape
{
      private String colour="red"; 
      Shape()
      {
            System.out.println("Shape is called");
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
            return("Colour is:"+ colour);
      }
      abstract double findArea();
}
class Square extends Shape
{
      private double length;
      public Square(double l)
      {
            length=l;
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
            return length*length;
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