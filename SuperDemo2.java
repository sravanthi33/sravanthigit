public class SuperDemo2
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.abc();
	}
}class A
{
	public void abc()
	{
		System.out.println("A abc");	
	}
}
class B extends A
{
	public void abc()
	{
		super.abc();
		System.out.println("B abc");
	}
}