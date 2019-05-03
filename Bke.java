class Vehic
{
	void run()
	{
	 System.out.println("Vehicle is rruning");
	}
	}
	class Bke extends Vehic
	{
		void run()
		{
			System.out.println("Bike is running Safely");
		}
	public static void main(String arg[])
	{
      Bke o1=new Bke();
      o1.run();
	}
}