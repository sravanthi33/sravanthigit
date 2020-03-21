public class Cloning
{
	public static void main(String args[])
	{
		Abc a=new Abc();
	 	a.i=5;  
		a.j=6;
		Abc a1=new Abc();
		a1.i=a.i;
		a1.j=a.j;
		a1.j=8;
		System.out.println(a1);
		System.out.println(a);
	}
}
class Abc
{
	int i;
	int j;
	public String toString()
	{
		return "Abc{"+"i="+i+", j="+j+"}";
	}
}