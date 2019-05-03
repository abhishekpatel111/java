class Adder
{
  static int add(int a,int b)
  {
  return a+b;
  }
  static double add(double a,double b)
  {
  return a+b;
  }
  }
  class OverLoad{
 public static void main(String ars[])
 {
  System.out.println(Adder.add(12,23));
  System.out.println(Adder.add(12.9,23.4));
 }
 }