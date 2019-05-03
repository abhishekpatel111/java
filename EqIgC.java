import java.util.ArrayList;
class EqualsIgnoreCaseE
{
  public static void main(String arg[])
  {
  String s1="Mukesh Kumar";
  ArrayList<String>list=new ArrayList<>();
  list.add("Mohan");
  list.add("Mukesh");
  list.add("RAVI");
  list.add("MuKesH kuMar");
  list.add("Suresh");
  for(String str:list)
  {
   if(str.equalsIgnoreCase(s1))
     {
      System.out.println("Mukesh kumar is present");
     }
  }
  }	
}