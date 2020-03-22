class Hi implements Runnable
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
class Hello implements Runnable
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
public class ThreadRunnableDemo
{
	public static void main(String args[])
	{
		Runnable h1=new Hi();
		Runnable h2=new Hello();
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t2.start();
	}
}