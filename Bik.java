abstract class Bike
{
	abstract void run();
}
class Hero extends Bike
{
	void run()
	{
	  System.out.println("RUNNING SAFELY");
	}
	public static void main(String args[])
	{
	 Bike obj=new Hero();
	 obj.run();
	}
}