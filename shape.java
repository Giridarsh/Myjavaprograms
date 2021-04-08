abstract class Shape
{
   private double height;  
   private double width;   
   public void setValues(double height, double width)
   {
      this.height = height;
      this.width = width;
   } 
   public double getHeight() 
   {
       return height;
   } 
   public double getWidth() 
   {
       return width;
   } 
abstract double getArea();
}
class Rectangle extends Shape
{
    public double getArea()
    {
        return getHeight() * getWidth();
    }
}
class Triangle extends Shape
{ 
    public double getArea() 
    {
        return (getHeight() * getWidth()) / 2;
    }
}       
class shape
{
    static public void main(String asd[])
    {
        Shape obj;
        Rectangle obj1 = new Rectangle();
        obj = obj1; 
        obj.setValues(78, 5);
        System.out.println("Area of rectangle : " + obj.getArea());
        Triangle obj2 = new Triangle();        
        obj = obj2;        
        obj.setValues(34,3);    
        System.out.println("Area of triangle : " + obj.getArea());
    }
}










