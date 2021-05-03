class animal
 {
    synchronized public void call(String num)
 {
   System.out.println(num);
   for(int s=0;s<5;s++)
   {
      System.out.println(""+s);
   }  
   
 }
 }
class bird extends Thread
 {
   String name;
   animal leg;
   Thread t=new Thread(this);
    bird(animal legs,String name)
 {
  leg=legs;
  this.name=name;
  t.start();     
 }
 public void run()
 {
  leg.call(name);
 }
 }
class synch
 {
    public static void main(String asd[])
 {
    animal obj=new animal();
    bird obj1=new bird(obj,"Bird : Given food is Eaten");
    bird obj2=new bird(obj,"Bird : Going to prey for Next food");
 }
 }