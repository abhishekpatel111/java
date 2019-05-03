class IdxEx
{
	public static void main(String args[])
	{
	String s1="this is index example";//passing substring
	int idx1=s1.indexOf("is");
	int idx2=s1.indexOf("index");
	System.out.println(idx1+" "+idx2);
	int idx3=s1.indexOf("is",4);
	System.out.println(idx3);
	int idx4=s1.indexOf('s');
	System.out.println(idx4);
	}
}