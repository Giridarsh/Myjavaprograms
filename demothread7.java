class MultiThread implements Runnable 
{
      public void run()
      {
            for (int i = 0; i < 10; i++)
            {
                  System.out.println("Thread " + Thread.currentThread().getId()+ " is running");
            }
      }
}

public class demothread7
{
      static public void main(String[] asd)
      {
            Thread obj = new Thread(new MultiThread());
            obj.start();
            for (int i = 0; i < 10; i++)
            {
                  System.out.println("Main Thread id: " + Thread.currentThread().getId());
            }
      }
}