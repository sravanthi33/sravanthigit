public class InheritanceObjCreation
{
	public static void main(String args[])
	{
		A obj=new B(3);	
	}
}
class A
{
	public A()
	{
		System.out.println("In A const");
	}
	public A(int i)
	{
		System.out.println("In A const Int");
	}
}
class B extends A
{
	public B()
	{
		System.out.println("In B const");
	}
	public B(int i)
	{
		System.out.println("In B const Int");
	}
}