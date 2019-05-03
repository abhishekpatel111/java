public class FormatExample
{
	public static void main(String args[])
	{
	String name="Swastika";
	String s1=String.format("name is %s",name);
	String s2=String.format("value is %f",32.3356);
	String s3=String.format("value is %32.12f",32.343456);
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	}
}