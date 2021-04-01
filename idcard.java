class studentdetails
{
	public void name()
	{
		System.out.println("STUDENT DETAILS\n");
		System.out.println("Name : Kaniska P");
	}
	public void rollno()
	{
		System.out.println("RollNo : 10145");
	}
	public void standard()
	{	
		System.out.println("Standard : X-E");
	}
	public void address()
	{
		System.out.println("Address : 279/1 Exserviceman Colony Reddiyur Salem");
	}
	public void pincode()
	{
		System.out.println("Pincode : 636004\n\n");
	}
}
class schooldetails
{
	public void schoolname()
	{
		System.out.println("SCHOOL DETAILS\n");
		System.out.println("School Name : Emerald Valley Public School Salem");
	}
	public void fathername()
	{
		System.out.println("FatherName : K.Paramasivam");
	}
	public void mothername()
	{
		System.out.println("MotherName : P.Deepalakshmi");
	}
}
class schooldetails1 extends schooldetails
{
	public void mobnum()
	{
		super.fathername();
		System.out.println("Number : 9843032388");
	}
	public void mbnum()
	{
		super.mothername();
		System.out.println("Number : 9442232388");
	}
	public void bloodgroup()
	{
		System.out.println("Bloodgroup : O+ve");	
	}
	public void year()
	{
		System.out.println("Year : 2020-2021");
	}
}


class idcard
{
	public static void main(String args[])
	{
		studentdetails obj1 = new studentdetails();
		obj1.name();
		obj1.rollno();
		obj1.standard();
		obj1.address();
		obj1.pincode();
		schooldetails obj2 = new schooldetails();
		obj2.schoolname();
		obj2.fathername();
		obj2.mothername();
		schooldetails1 obj3 = new schooldetails1();
		obj3.mobnum();
		obj3.mbnum();
		obj3.year();
		obj3.bloodgroup();
	}
}













		