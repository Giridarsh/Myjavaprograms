class demo extends Thread
{
      public void printCount()
      {
            try
            {
                  for(int i = 5; i > 0; i--)
                  {
                        System.out.println("Count --- " + i );
                  }
            } 
            catch (Exception e)
            {
                  System.out.println("Thread " + Thread.currentThread().getName()+" interrupted.");
            }
      }
      public synchronized void run()
      {
            printCount();
            System.out.println("Thread " + Thread.currentThread().getName() + " exiting.");
      }
}
class demosynch 
{
      static public void main(String args[]) throws InterruptedException
      {
            demo obj = new demo();
            Thread t1 = new Thread(obj );
            Thread t2 = new Thread(obj );
            t1.start();
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Interrupted");
      }
}