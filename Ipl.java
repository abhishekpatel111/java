class IPL_Team
{
String name,wck,alrnd,cpt;
IPL_Team(String names,String wicky,String allround,String captain)
{
name=names;
wck=wicky;
alrnd=allround;
cpt=captain;
}
private Player
{
String pname ; 
Integer price;
Player(String playername,Integer pricee)
{
pname=playername;
price=pricee;
}
}
Player obj4=new Player("Vicky",12000);
Player obj5=new Player("Vikas",15000);
Player obj6=new Player("Varun",9000);
 public void display()
{
System.out.println(name+"\t"+wck+"\t"+alrnd+"\t"+cpt+"\t");
}
}
class main
{
public static void main(String...rtk)
{
TreeSet ts=new TreeSet ((x,y)->y.price.compareTo(x.price)); //specifically calling the compareTo function to perform sorting mechanism.
IPL_Team obj1=new IPL_Team("Draco","Dhoni","Umesh","Vicky");
IPL_Team obj2=new IPL_Team("Dignitas","Mahi","Rahul","Vikas");
IPL_Team obj3=new IPL_Team("Faze","Konak","Satir","Varun");
ts.add(obj1) ; ts.add(obj2) ; ts.add(obj3);

Iterator i=ts.iterator();
while(i.hasNext())
{
IPL_Team t=i.next();
t.display();
break;
} 
}
}