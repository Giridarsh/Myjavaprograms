class Count extends Thread
{
   Count()  
   {
     Thread t = new Thread(this);
     System.out.println("Creating Thread");
     start();
   }
   public void run()
   {
     try
     {
        for (int i=0 ;i<10;i++)
        {
           System.out.println("COUNT" + i);
           Thread.sleep(500);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Thread is interrupted");
     }
     System.out.println("Exiting Thread" );
   }
}
class demothread1
{
   static public void main(String args[])
   {
      Count ct = new Count();
      try
      {
         while(ct.isAlive())
         {
           System.out.println("Main thread will be alive till the Child thread is live");
           Thread.sleep(500);
         }
      }
      catch(InterruptedException e)
      {
        System.out.println("Main thread is interrupted");
      }
      System.out.println("Main thread's run is over" );
   }
}