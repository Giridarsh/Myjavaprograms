class demo extends Thread
{
      public void count()
      {
            try
            {
                  for(int i = 5; i > 0; i--)
                  {
                        System.out.println("Count --- " + i );
                        Thread.sleep(500);
                  }
            } 
            catch (Exception e)
            {
                  System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
            }
      }
      public synchronized void run()
      {
            count();
            System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
      }
}
class demosynch1 
{
      static public void main(String asd[]) throws InterruptedException
      {
            demo obj = new demo();
            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj);
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Not Interrupted");
      }
}