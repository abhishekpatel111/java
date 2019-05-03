class GetBytesE
{
public static void main(String args[])
{
  String s1="RAJMANI PATEL";
  byte[] ba=s1.getBytes();
  for(int i=0;i<ba.length;i++)
    {
     System.out.println(ba[i]);
    }	
}
}