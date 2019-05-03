class Change
{
	int rollno;
	String name;
	static String college="LPU";
	//STATIC METHOD TO CHANGE THE VALUE OF STATIC 
	static void change()
	{
	 college="LOVELY";
	}
	Change(int r,String n)
	{
	 rollno=r;
	 name=n;
	}
	void display()
	{
	 System.out.println(rollno+" "+name+" "+college);
	}
 public static void main(String args[])
 {
 Change.change();
 Change s1=new Change(111,"KARAN");
 Change s2=new Change(187,"ARJUN");
 s1.display();
 s2.display();
 }
 }