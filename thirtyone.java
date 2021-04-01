class Main
{
      String name;
      int price,modelyear;
      public void set( String name,int price,int modelyear )
      {
            this.name = name;
            this.price = price;
            this.modelyear = modelyear;
      }
      public void get()
     {
           System.out.println("Name : \t\t"+name); 
           //return name;     
     }
      public void hat()
     {
           System.out.println("Price : \t"+price);
           //return price;
           System.out.println("Modelyear : \t"+modelyear);
           //return modelyear;
     }
}

class thirtyone
{
      public static void main( String[] args )
      {
            Main obj = new Main();
            obj.set("Samsung M Series",15000,2020);
            obj.get();
            obj.hat();
      }
}