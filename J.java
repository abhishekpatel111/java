import java.util.*;
import java.io.*;
class J
{
	public static void main(String []awa)
	{
	Scanner in=new Scanner(System.in);
	 int t=in.nextInt();
	 int a=in.nextInt();
	 int b=in.nextInt();
	 int n=in.nextInt();
	 int s;
	 for(int k=0;k<t;k++)
	 {
	 for(int i=1;i<=n;i++)
	 {
	 	s=a+b*((2^n)-1);
	 System.out.print(s+" ");
	 }
	}
}
}