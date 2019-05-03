import java.io.*;
class File
{
	public static void main(String arg[])
	{
	 FileInputStream finp=new FileInputStream("abc.txt");
	 FileOutputStream fiout=new FileOutputStream("xyz.txt",true);
	 int p=0;
	 while((p=finp.read())!=-1)
	 {
	 System.out.print((char) p);
	 fiout.write((char) p);
	 }
	 finp.close();
	 fiout.close();
	}
}
