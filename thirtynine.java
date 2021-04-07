abstract class Beverages
{
      public void addMilk() 
      {
            System.out.println("Hot Milk");
      }
      abstract void addIngredient();
}
class Tea extends Beverages
{
      void addIngredient()
      {
            System.out.println("add Tea Powder and Sugar");
      }
}
class Coffee extends Beverages
{
      void addIngredient()
      {
            System.out.println("add Coffee Powder and Sugar");
      }
}


class thirtynine
{
      public static void main(String[] args)
      {
            Coffee obj = new Coffee();
            obj.addMilk();
            obj.addIngredient();
      }
}