class Item
{
      private int value;
      boolean valueSet = false;
      public synchronized void setItem(int i) throws InterruptedException
      {
            if (valueSet)
            {
                  wait();
            }
            value = i;
            System.out.print("Producer Selling Item: " + i);
            notify();
            valueSet = true;
      }
      public synchronized int getItem() throws InterruptedException
      {
            if (!valueSet)
            {
                  wait();
            }
            System.out.println(" ->  Consumer Receiving Item: " + value);
            notify();
            valueSet = false;
            return value;
      }
}

//Producer 

class Producer extends Thread
{
      private Item item;
      int i;
      public Producer(Item item)
      {
            this.item = item;
      }
      public void run()
      {
            while (true)
            {
                  try
                  {
                        sleep(500);
                        item.setItem(++i);
                  }
                  catch (InterruptedException e)
                  {
                        e.printStackTrace();
                  }
            }
      }
}

//Consumer 

class Consumer extends Thread
{
      private Item item;
      public Consumer(Item item)
      {
            this.item = item;
      }
      public void run()
      {
            while (true)
            {
                  try
                  {
                        sleep(500);
                        int temp = item.getItem();
                  }
                  catch (InterruptedException e)
                  {
                        e.printStackTrace();
                  }
            }
      }
}

class demoitc3
{
      static public void main(String asd[])
      {
            Item item = new Item();
            Producer producer = new Producer(item);
            Consumer consumer = new Consumer(item);
            producer.start();
            consumer.start();
      }
}