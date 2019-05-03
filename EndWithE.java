class EndWithE
{
	public static void main(String []a)
	{
	 String s1="welcome to Javatpoint.com";
	 System.out.println(s1.endsWith("point"));
	 if(s1.endsWith(".om"))
	 {
	  System.out.println("String ends with .com");
	 }
	 else System.out.println("it does not end with .com");
	}
}