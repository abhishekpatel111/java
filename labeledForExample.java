class LabeledForExample
{
	public static void main(String arg[])
	{
	a:
	for(int i=1;i<=3;i++)
	  {
	  b:
	     for(int j=1;j<=3;j++)
	         {
	          if(i==2&&j==2)
	            {
	             break b;
	            }
	              System.out.println(i+" "+j);
	         }
	  }
	}
}