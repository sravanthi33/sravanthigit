public class MethodOverriding
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.show();
	}
}
class A
{
	public void show()
	{
		System.out.println("In show A");
	}
}
class B extends A
{
	public void show()
	{
		System.out.println("In show B");
	}	
}