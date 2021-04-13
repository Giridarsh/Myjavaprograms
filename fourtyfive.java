import java.io.*;
import java.lang.*;

class Headquarters
{
      Headquarters()
      {
            int totalemployees;
            String cityname; 
            DataInputStream s = new DataInputStream(System.in);
            try
            {   
                  public void getDetails()
                  {
                        System.out.println("Enter City Where Headquarters is Situated :");
                        String cityname =String.parseString(s.readLine()); 
	       cityname=s.readLine();
	       System.out.println("Enter Total Number of Employees in Headquarters");
                        int totalemployees =Integer.parseInt(s.readLine());
	       totalemployees=s.readLine();
                  }
                  public void showDetails()
                  {
                        System.out.println("Company Headquarters is Situated in "+cityname+" and has "+totalemployees+" Employees");
                  }
            }catch(Exception a) {}
      }
}

class Mainbranch extends Headquarters
{
      Mainbranch()
      {	
            int totalMBemployees;
            String citynameMB; 
            DataInputStream s = new DataInputStream(System.in);
            try
            {
                  public void getDetails()
                  {   
                    
                        System.out.println("Headquarters:");
                        super.getDetails();
                        System.out.println("Main Branch:");
                        System.out.println("Enter City Where Main Branch is Situated");
	       int totalMBemployees =Integer.parseInt(s.readLine());
                        s.readLine();
	       citynameMB=s.readLine();
	       System.out.println("Enter The Total Number of Employees In Main Branch");
	       String citynameMB =String.parseString(s.readLine());
	       totalMBemployees=s.readLine();
                  }
                  public void showDetails()
                  {	
                        System.out.println("Headquarters :");
                        super.showDetails();
                        System.out.println("Main Branch :");
	       System.out.println("Company Main Branch is Situated in "+citynameMB+" and has "+totalMBemployees+" Employees");
                  }
             }catch(Exception a) {}
      }
}

class fourtyfive
{
      public static void main(String args[])
      {	
            Mainbranch obj=new Mainbranch();
            obj.getDetails(); 
            obj.showDetails();
      }
}