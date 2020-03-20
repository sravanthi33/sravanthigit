public class MethodOverloading
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.show();
		obj.show(5);
	}
}
class A
{
	public void show()
	{
		System.out.println("Hello");
	}
	public void show(int i)
	{
		System.out.println("Hai "+i);
	}
}