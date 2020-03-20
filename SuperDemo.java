public class SuperDemo
{
	public static void main(String args[])
	{
		B obj=new B(3);
	}
}
class A           
{  
	public A()
	{	
		System.out.println("In const A");
	}	
	public A(int i)
	{	
		System.out.println("In const A Para");
	}
}
class B extends A
{
	public B()
	{	
		System.out.println("In const B");
	}
	public B(int i)
	{	
		super(i);
		System.out.println("In const B Para");
	}
}