abstract class A
{  
 abstract void x();      
 abstract void y();  
}  
class XYZ
{  
 public static void main(String args[])
 {  
  A o1=new A()
  {  
  void x()
  {
  System.out.println("THIS IS X");
  }
  void y()
  {
  System.out.println("THIS IS Y");
  }  
  };
  o1.x();
  o1.y();
 }  
}  