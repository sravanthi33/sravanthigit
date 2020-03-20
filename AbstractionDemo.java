public class AbstractionDemo
{
	public static void main(String a[])
	{
		OnePhone o=new ThirdPhone();
		o.call();
		o.cook();
		o.dance();
		o.move();
	}
}
abstract class OnePhone
{
	public void call()
	{
		System.out.println("calling....");
	}
	public abstract void move();
	public abstract void dance();
	public abstract void cook();
}
abstract class SecondPhone extends OnePhone
{
	public void move()
	{
		System.out.println("Moving......");
	}	
}
class ThirdPhone extends SecondPhone
{
	public void dance()
	{
		System.out.println("Dancing...");
	}
	public void cook()
	{
		System.out.println("Cooking.....");
	}
}





