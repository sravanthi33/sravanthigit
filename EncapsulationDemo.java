class A
{
	private int i;
	public void setI(int j)
	{
		i=j;
	}	
	public int getI()
	{
		return i;
	}
}
class EncapsulationDemo
{
	public static void main(String args[])
	{
		A a=new A();
		a.setI(33);
		System.out.println(a.getI());	
	}
}