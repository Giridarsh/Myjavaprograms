abstract class Employee
{ 
      String employeeId;
      String employeeName;	
      Employee(String employeeId,String employeeName)
      {
            this.employeeId = employeeId;
            this.employeeName = employeeName;
      }	
      void displayName(String employeeName)
      {
            System.out.println("\nName of the player : "+employeeName);
      }
      abstract void role(String employeeId,String employeeName); 
}

class AbstractClassDemo extends Employee
{
      String employeeId;
      AbstractClassDemo(String employeeId,String employeeName)
      {
            super(employeeId,employeeName);
            this.employeeId = employeeId;
      }
      public void role(String employeeId,String employeeName)
      {
            if(employeeId.equals("ID007"))
            {
                  System.out.println(employeeName+" : Captain and Wicket Keeper");
            }
            else if(employeeId.equals("ID099"))
            {
                  System.out.println(employeeName+" : Opening Batsman and Spin Bowler");
            }
            else
            {
                  System.out.println("Not an Employee");
            }
      }
}

class thirtysix
{
      static public void main(String asd[])
      { 
            Employee obj = new AbstractClassDemo("ID007","M S Dhoni"); 
            AbstractClassDemo obj1 = new AbstractClassDemo("ID099","Sachin Tendulkar");
            obj.displayName("M S Dhoni");
            obj.role("ID007","\nM S Dhoni"); 
            obj1.role("ID099","\nSachin Tendulkar"); 
      } 
}