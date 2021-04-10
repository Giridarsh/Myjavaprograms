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
class shape1
{
    static public void main(String asd[])
    {
        Shape obj;
        Rectangle rect = new Rectangle();
        obj = rect; 
        obj.setValues(13, 5);
        System.out.println("Area of rectangle : " + obj.getArea());
        Triangle trian = new Triangle();        
        obj = trian;        
        obj.setValues(47,3);    
        System.out.println("Area of triangle : " + obj.getArea());
    }
}










