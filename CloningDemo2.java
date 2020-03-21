 public class CloningDemo2 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Abc a=new Abc();
	 	a.i=5;  
		a.j=6;
		Abc a1=(Abc)a.clone();
		a1.j=8;
		System.out.println(a1);
		System.out.println(a);
	}
}
class Abc implements Cloneable
{ 
	int i,j;
	@Override
	public String toString()
	{
		return "Abc{"+"i="+i+", j="+j+"}";
	}
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}




