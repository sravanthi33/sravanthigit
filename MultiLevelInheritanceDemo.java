public class MultiLevelInheritanceDemo
{
	public static void main(String args[])
	{
		AddSubMul obj=new AddSubMul();
		obj.num1=7;
		obj.num2=4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
		obj.mul();
		System.out.println(obj.result);
	}
}
class Add
{
	int num1,num2,result;
	public void sum()
	{
		result=num1+num2;
	}
}
class AddSub extends Add
{
	public void sub()
	{
		result=num1-num2;
	}
}
class AddSubMul extends AddSub
{
	public void mul()
	{	
		result=num1*num2;
	}
}

