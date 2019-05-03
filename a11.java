class Calcu
{

	void abhi(int x,int y)
	{ 
    int z;
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
   int a;
    int b;
  Calcu o1=new Calcu();
  o1.abhi(16,4);

  }
 } 