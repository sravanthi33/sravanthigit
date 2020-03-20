public class DemoStaticBlock
{
	static
	{
		System.out.println("This is a statement in static block 1");
	}
	public static void main(String[] a)
	{
		System.out.println("This is a statement in main method");
	}
	static
	{
		System.out.println("This is a statement in static block 2");
	}  
}