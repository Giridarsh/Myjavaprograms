class Pattern
{
      public void DisplayA()
      {
            for(int i=1;i<=25;i++)
            System.out.print("A");
      }
      public void DisplayB()
      {
            for(int i=1;i<=25;i++)
            System.out.print("B");
      }
      public void DisplayC()
      {
            for(int i=1;i<=25;i++)
            System.out.print("C");
      }
}
class ThreadA extends Thread
{
      Pattern P;
      ThreadA(Pattern P)
      {
            this.P = P;
       }
      public void run()
      {
            P.DisplayA();
      }
}
class ThreadB extends Thread
{
      Pattern P;
      ThreadB(Pattern P)
      {
            this.P = P;
      }
      public void run()
      {
            P.DisplayB();
      }
}
class ThreadC extends Thread
{
      Pattern P;
      ThreadC(Pattern P)
      {
            this.P = P;
      }
      public void run()
      {
            P.DisplayC();
      }
}
class demothread8
{
      static public void main(String arg[])
      {
            Pattern P = new Pattern();
            ThreadA t1 = new ThreadA(P);    
            ThreadB t2 = new ThreadB(P);    
            ThreadC t3 = new ThreadC(P);    
            t1.start();
            t2.start();
            t3.start();

      }
}