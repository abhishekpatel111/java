class Hero
{
	int speed;
	Hero()
	{
	 System.out.println("constructor is invoked");
	}
	{
	System.out.println("instance initializer block invoked");
	}
	public static void main(String args[])
	{
	 Hero h1=new Hero();
	 Hero h2=new Hero();
	}
}