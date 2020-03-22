class Hi extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hi");
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}
class Hello extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello");
			try{Thread.sleep(1000);}
			catch(Exception e){}
		}
	}
}
public class ThreadDemo
{
	public static void main(String args[])
	{
		Hi h1=new Hi();
		Hello h2=new Hello();
		h1.start();
		try{Thread.sleep(1000);}catch(Exception e){}
		h2.start();
	}
}