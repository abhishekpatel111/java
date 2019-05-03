class A
{
	int x;
	int y;
	abstract void x()
    {}
    abstract void y()
    {}
}
class B extends A
{
	
}
class XYZ
{
	public static void main(String ard[])
	{
	 B o1=new B();
	 o1.x();
	 o1.y();
	}
}