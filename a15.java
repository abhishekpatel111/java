import java.util.*;
class Student
{
	  String name;
	  int roll_no;
	  String section;
	  void read()
	  {
	  	name="ABHISHK PATEL";
	  	roll_no=42;
	  	section="K17KVB";
	  	System.out.println("NAME OF THE STUDENT :"+name);
	  	System.out.println("ROLL_NO. OF THE STUDENT :"+roll_no);
	  	System.out.println("SECTION  OF THE STUDENT :"+section);
	  }
}
class Vidyarthi
{
   public static void main(String arg[])
   {
   	Student ob=new Student();
   	ob.read();
   }
}