class demothread 
{
      static public void main(String args[])
      {
            Thread t = Thread.currentThread();
            System.out.println("Current thread : " + t);
            t.setName("My Thread");
            System.out.println("After name change : " + t);
            try
            {
                  for(int n = 5; n > 0; n--)
                  {
                        System.out.println( n+"\t" );
                        Thread.sleep(500);
                  }
            } catch (InterruptedException e)
               {
                     System.out.println("Main thread interrupted");
               }
      }
}