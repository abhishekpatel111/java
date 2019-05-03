class Y
{
	double m;
	double r;
	void readData()
	{
	m=9;
	r=8;
	}
	double inertia()
	{
	 return m*r*r;
	}
}
 class I{
	public static void main(String arg[])
	{
	 Y y=new Y();
	 double iner=y.inertia();
	 System.out.println("inertia of y is"+iner);
	}
}