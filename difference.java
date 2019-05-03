class Difference
{
	public static void main(String arg[])
	{
	System.out.println(20>>2);
	System.out.println(20>>>2);
	//for positive number,>> and >>> work same
	System.out.println(-20>>2);
	System.out.println(-20>>>2);
	//for negative number ,>>> change parity bit(MSB) to 0
	}
}