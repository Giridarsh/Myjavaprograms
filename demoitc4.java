public class demoitc4 {

  static public void main(String asd[])
  {
     final Pen pn =new Pen();
     final Paper pr =new Paper();

     Thread t1 = new Thread() {
        public void run()
        {
            synchronized(pn)
            {
                System.out.println("Thread 1 is having Pen");
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){}
                synchronized(pr)
                {  
                  System.out.println("Requesting for Paper"); 
                }
            }
        }
      };
      Thread t2 = new Thread() {
          public void run()
          {
              synchronized(pr)
              {
                  System.out.println("Thread 2 is having Paper");
                  try {
                      Thread.sleep(500);
                  }
                  catch(InterruptedException e){}
                  synchronized(pn)
                  {  
                      System.out.println("requesting for Pen"); 
                  }
              }
          }
      };
      t1.start();
      t2.start();
  }
}