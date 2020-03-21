public class ThrowDemo
{
	void ageCheck(int age)
	{
		if(age<18)
			throw new ArithmeticException("Not elligible for voting");
		else
			System.out.println("Eligible for voting");
	}
	public static void main(String args[])
	{
		ThrowDemo t=new ThrowDemo();
		t.ageCheck(15);
		System.out.println("End of program");
	}
}