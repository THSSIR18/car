public class Car
{
	private int year;
	private String color;
	private int engHp=135; 
	private double cost;
	private static int numberOfWheels = 4;
	
	public Car()
	{
	}
	public Car (Car nap)
    {
        this.color = nap.color;
	     this.year = nap.year;
	     this.engHp = nap.engHp;
	     this.cost = nap.cost;
	 }
	public Car(String c)
	{
		color= c;
	}
	public Car(String a , int b)
	{
		color = a;
		year= b;
	}
	public Car(int y)
	{
		year= y;
	}
	public int getYear()
	{
		return year;
	}
	public String getColor()
	{ 
		return color;
	}
	public int getHP()
	{
		return engHp;
	}
	public void setColor(String x)
	{
		color = x;
	}
	public static boolean setWheels(int y)
	{
		if (y==2 || y==4 || y==6)
		{
		numberOfWheels = y; 
		return true;
		
		}
		else 
		{
		
		return false;
		}
	}
	private double findCost(int x, int y)
	{
		return 20000 - (2015- x)*1200+y*1.4;
	}
	public boolean changeEng(int newHP)
	{
		if (newHP>engHp )
		{
		cost = findCost(year, newHP);
		return true;
		}
		else
		{
			return false;
		}
	}
	public String toString()
	{
		System.out.println("The Car's color is " + color + "\n" + "The year is " + year + "\n" + "The number of wheels is " + numberOfWheels);
		return "";
	} 
	

	
}