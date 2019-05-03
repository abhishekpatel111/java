class Balak 
{
	int rollno;
	String name;
	float fee;
    Balak(int rollno,String name,float fee)
    {
      this.rollno=rollno;
      this.name=name;
      this.fee=fee;
    }
    void display()
    {
      System.out.println(rollno+" "+name+" "+fee);
    }
    }
    class Boy
    {
    public static void main(String args[])
    {
    Balak s1=new  Balak(321,"ARTIKA",3000f);
     Balak s2=new  Balak(354,"Asaru",4500f);
    s1.display();
    s2.display();
    }
    }