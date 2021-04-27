class demo extends Thread
{
      Thread t = new Thread(this);
      public void run()
      {
            for(int i=0;i<10;i++)
            {
                  System.out.println(""+i);
            }
      }
}

class demothread6 
{
      static public void main(String asd[]) throws InterruptedException
      {
            demo obj1 = new demo();
            demo obj2 = new demo();
            obj1.start();
            obj1.join();
            obj2.start();
      }
}