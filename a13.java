import java.lang.*;
import java.util.Scanner;
class A
{
void menu()
{
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
switch(a)
{
case 1:
System.out.println("**********MENU-VEGITARIAN ********");
System.out.println("SELECT YOUR FAVOURATE FOOD");
System.out.println("1.KADAI PANNER");
System.out.println("1.MASHROOM TIKA");
System.out.println("2.RAJMA CHAWL");
int b = sc.nextInt();
switch(b)
{
	case 1:
	System.out.println("kadai panner.........RS 500");
	break;
	case 2:
	System.out.println("MASHROOM TIKA........RS400");
	break;
	case 3:
	System.out.println("RAJMA CHAWL..........RS200");
	break;
	default :
	System.out.println("WRONG INPUT");
	break;
}
break;
case 2:
 System.out.println("*******MENU -NON-VEGITARIAN *******");
 System.out.println("1.CHICKEN LEG");
System.out.println("2.CHICKEN HAND");
System.out.println("3.CHICKEN HEAD");
 int c = sc.nextInt();
 switch(c)
{
	case 1:
	System.out.println("CHICKEN LEG...........RS500");
	break;
	case 2:
	System.out.println("CHICKEN HAND...........RS400");
	break;
	case 3:
	System.out.println("CHICKEN HEAD...........RS1000");
	break;
	default :
	System.out.println("WRONG INPUT");
	break;
}
 default:
 System.out.println("wrong input");
 }
 }
 }
 class B
 {
 
 public static void main(String[] arg)
 {System.out.println("please choose your menu type");
 System.out.println("1.VEG");
 System.out.println("2.NON-VEG");
 A ob = new A();
 ob.menu();
 }
 }