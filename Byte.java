class Byte
{
	public static void main(String[] args)
	{
	 String s1="USHADEVI";
	 byte[] barr=s1.getBytes();
	 for(int i=0;i<barr.length;i++)
	    {
	    System.out.println(barr[i]);
	    }
	    String s2=new String(barr);
	    System.out.println(s2);
	}
}