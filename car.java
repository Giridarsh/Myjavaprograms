import javax.swing.JOptionPane;
public classCar
{
	private int yearModel;
	private String make;
	private int speed;
	public Car (int yrModel, String carMake)
	{
		yearModel = yrModel;
		make = carMake;
            		speed = 0;
        	}

        	public void setyearModel(int yrModel)
        	{
        		yearModel = yrModel;
    	}
    	public void setMake (String carMake)
    	{
        		make = carMake;
    	}
        	public void setSpeed(int carSpeed)
        	{
        		speed = carSpeed;
    	} 

    	public int getYearModel()
    	{
        		return yearModel;
    	}
    	public String getMake ()
    	{
        		return make;
    	}
    	public int getSpeed ()
    	{
        		return speed;
    	}
    	public void AccelerateSpeed (int speed)
    	{
            		speed = speed + 5;
    	}
    	public void BrakeSpeed (int speed)
    	{
         		speed = speed - 5;

    	}
}



public class MyNewCar 
{
 	public static void main(String[] args)
	{
         		Car myCar = new Car (2010, "Honda");
        		int speed = myCar.getSpeed();
        		speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));
        		for (int i = 0; i < 5; i++)
        		{
          			System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                   		" " + "is going " );
           			myCar.AccelerateSpeed(speed);
           			System.out.println("Your Speed now is: " + speed);
        		}	

        		speed = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Speed" ));
        		for (int i = 0; i < 5; i++)
        		{
          			System.out.println("The" + " " + myCar.getYearModel() + " " + myCar.getMake() +
                   		" " + "is going " );
           			myCar.BrakeSpeed(speed);
           			System.out.println("Your Speed now is: " + speed);
			classCar obj = new classCar;
			obj.Car();
			obj.setyearModel();	
			obj.setMake();
			obj.setSpeed();
			obj.getYearModel();
			obj.getMake();
			obj.getSpeed();
			obj.AccelerateSpeed();
			obj.BrakeSpeed();
        		}
	}
}
