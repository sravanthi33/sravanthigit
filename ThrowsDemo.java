public class ThrowsDemo
{
	int division(int a,int b)throws ArithmeticException
	{
		int t=a/b;
		return t;
	}
	public static void main(String args[])
	{
		ThrowsDemo t=new ThrowsDemo();
		try
		{
			System.out.println(t.division(15,0));
		}
		catch(ArithmeticException e)
		{
			System.out.println("You shouldn't divide number by zero"); 
		}
	}
}