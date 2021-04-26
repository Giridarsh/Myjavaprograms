class MyThread extends Thread
{
      MyThread ()
      {
      
      }
      MyThread (String name)
      {
            setName (name); 
      }
      public void run ()
      {
            System.out.println ("My name is: " + getName ());
      }
}

class demothread4
{
      public static void main (String [] args)
      {
            MyThread t;
            if (args.length == 0)
            {
                  t = new MyThread ();
            }
            else
            {
                  t = new MyThread (args [0]);
            }
            t.start ();
      }
}
