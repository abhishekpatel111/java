class Calcu
{
	int x;
	int y;
	int z;
	void abhi(int x,int y)
	{
	  z=x+y;
	  z=x-y;
	  z=x*y;
	  z=x/y;
	  z=x%y;
      System.out.println("SUM :"+z);
      System.out.println("SUB :"+z);
      System.out.println("MULTIPLICATION :"+z);
      System.out.println("DIVISION :"+z);
      System.out.println("MODULO :"+z);
	}
}
 class B
 {
  public static void main(String args[])
  {
   int a=16;
   int b=4;
  Calcu o1=new Calcu();
  o1.abhi(a,b);

  }
 } 