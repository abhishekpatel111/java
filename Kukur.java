class Janwar
{
  void eat()
    {
     System.out.println("eating....");
    }	
}
class Dog extends Janwar
 {
  void eat()
  {
  System.out.println("eating bread...");
  }
  void bark()
  {
  System.out.println("barking...");
  }
  void work()
  {
   super.eat();
   bark();
  }
 }
 class Kukur
 {
  public static void main(String arg[])
  {
  Dog d=new Dog();
  d.work();
  }
 }