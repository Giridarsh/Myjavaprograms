class demo extends Thread   
{  
    demo (String a, ThreadGroup b)  
    {  
        super(b, a);  
    }  
    synchronized public void run()  
    {  
        for(int i = 0; i< 10; i++)   
        {  
            try  
            {  
                Thread.sleep(500);  
            }  
            catch (InterruptedException ex)   
            {  
                System.out.println(Thread.currentThread().getName());  
            }  
        }  
            System.out.println(Thread.currentThread().getName());  
    }  
}   
public class demoitc5
{  
    public static void main(String arg[])  
    {  
        ThreadGroup o1 = new ThreadGroup("parent thread group");   
        demo obj1 = new demo ("Thread 1 - ", o1);  
        demo obj2 = new demo ("Thread 2 - ", o1);  
        demo obj3 = new demo ("Thread 3 - ", o1);  
        demo obj4 = new demo ("Thread 4 - ", o1);  
        demo obj5 = new demo ("Thread 5 - ", o1);  
        demo obj6 = new demo ("Thread 6 - ", o1); 
        obj1.start();  
        obj2.start();  
        obj3.start(); 
    	obj4.start();
    	obj5.start();
    	obj6.start();
        System.out.println("Total number of active thread =====> "+ o1.activeCount());  
    }  
}  