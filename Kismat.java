class Animia
{
	Animia()
	{System.out.println("animal is created");}
}
class Dog extends Animia
{
	Dog(){
	super();
	System.out.println("dog is created");
	}
}
class Kismat
{
 public static void main(String arf[])
 {
  Dog d=new Dog();
 }
 }

