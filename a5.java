class A
{    
	int x;
	int y;
	int z;
	void Add(int x,int y)
	{
	     c=x+y;
         System.out.println("SUM OF TWO NO."+c);
	}
}
class B
{
	public static void main(String args[])
	{
	 int a=65;
	 int b=45;
	A.obj=new A(a,b);
	obj.Add();
	}
}