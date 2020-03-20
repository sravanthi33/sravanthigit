public class StaticVariableDemo
{
	public static void main(String a[])
	{
		Abc.show();
	}
}
class Abc
{
	static int i=5;
	public static void show()
	{
		System.out.println("i="+i);
	}
}