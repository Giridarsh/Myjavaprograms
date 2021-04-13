import java.util.Scanner;
class Headquarters
{
	int totalemployees; 
	String cityname; 
	Scanner sc=new Scanner(System.in);
	void getDetails()
	{
		System.out.println("Enter City Where Headquarters is Sitiuated :");
		cityname=sc.nextLine();
		System.out.println("Enter Total Number of Employees in Headquarters");
		totalemployees=sc.nextInt();
	}
	void showDetails()
	{
		System.out.println("Company Headquarters is Sitiuated in "+cityname+" and has "+totalemployees+" Employees");
	}
}

class Mainbranch extends Headquarters
{	
	int totalMBemployees;
	String citynameMB;
	
	void getDetails()
	{  
		System.out.println("Headquarters:");
		super.getDetails();
		System.out.println("Main Branch:");
		System.out.println("Enter City Where Main Branch is Sitiuated");
		sc.nextLine();
		citynameMB=sc.nextLine();
		System.out.println("Enter The Total Number of Employees In Main Branch");
		totalMBemployees=sc.nextInt();
	}
	
	void showDetails()
	{	
		System.out.println("Headquarters:");
		super.showDetails();
		System.out.println("Main Branch:");
		System.out.println("Company Main Branch is Sitiuated in "+citynameMB+" and has "+totalMBemployees+" Employees");
	}
}

class company
{
	public static void main(String args[])
	{
			
		Mainbranch M=new Mainbranch();
		M.getDetails(); 
		M.showDetails();
	}
}