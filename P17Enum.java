enum Day
{
	SUNDAY(1),MONDAY(2),TUESDAY(3),WEDNESDAY(4),THURSDAY(5),FRIDAY(6),SATURDAY(7);
	Day(int a)
	{
	 Systm.out.println("day is"+a+" day of week");
	}
}
class P17Enum
{
	public static void main(String[] args)
	{
	Day d;
	d=Day.MONDAY;
	System.out.println("asdfghjkl"+d);\
	System.out.println(" +d(d.valueOf("SUNDAY")));
     for(Day i:Day.values())
     {
      System.out.println("i);
     }
	}
}