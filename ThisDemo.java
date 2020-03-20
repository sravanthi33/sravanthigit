public class ThisDemo
{
	public static void main(String args[])
	{
		A obj=new A(3);
		obj.show();
		
	}
}
class A
{
	private int x;
	public A(int x)
	{
		this.x=x;
	}
	public void show()
	{
		System.out.println("x is "+x);
	}
}