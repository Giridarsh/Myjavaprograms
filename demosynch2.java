class Process implements Runnable
{
      private int count;
      public void run()
      {
           for(int i=1; i < 5; i++){
           processSomething(i);
           count++;
      }
}
public int getCount()
{
      return this.count;
}
private void processSomething(int i)
{
      try
      {
            Thread.sleep(i*1000);
      }
      catch (InterruptedException e)
      {
      }
}
}

public class demosynch2
{
      static public void main(String asd[]) throws InterruptedException
      {
            Process obj = new Process();
            Thread t1 = new Thread(obj, "t1");
            t1.start();
            Thread t2 = new Thread(obj, "t2");
            t2.start();
            t1.join();
            t2.join();
            System.out.println("Processing count="+obj.getCount());
      }
}
