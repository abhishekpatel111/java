class Const
{
int id;
String name;
void display()
{
	System.out.println(id+" "+name);
}
    public static void main(String args[])
    {
    Const c1=new Const();
    Const c2=new Const();
    c1.display();
    c2.display();
    }
}
