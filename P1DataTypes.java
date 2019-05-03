class LogicDataTypeSize
{
byte b;
short s;
int i;
long l;
char c;
float f;
double d;
boolean bo;
void sizeDataType()
{
System.out.println("byte size is"+Byte.SIZE);
System.out.println("byte size is"+Short.SIZE);
System.out.println("byte size is"+Integer.SIZE);
System.out.println("byte size is"+Long.SIZE);
System.out.println("byte size is"+Character.SIZE);
System.out.println("byte size is"+Float.SIZE);
System.out.println("byte size is"+Double.SIZE);

System.out.println("");
System.out.println("");

System.out.println("default value is"+b);
System.out.println("default value is"+s);
System.out.println("default value is"+i);
System.out.println("default value is"+l);
System.out.println("default value is"+c);
System.out.println("default value is"+f);
System.out.println("default value is"+d);
System.out.println("default value is"+bo);
}}
public class P1DataTypes
{
public static void main(String args[])
{
LogicDataTypeSize obj=new LogicDatypeSize(); 
obj.sizeDataType();
}
}
