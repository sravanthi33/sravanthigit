import java.io.*;
public class DemoException
{
	public static void main(String args[])
	{
		int i=3;
		try
		{
			if(i<10)
			{
				throw new MyException("Errorrrr");
			}
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
class MyException extends Exception
{
	public MyException(String msg)
	{
		super(msg);
	}
}










