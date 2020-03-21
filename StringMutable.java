public class StringMutable
{
	public static void main(String args[])
	{
		StringBuffer sbf=new StringBuffer("Sravanthi");
		sbf.append(" reddy");
		sbf.replace(0,9,"sravs");
		sbf.delete(8,10);
		System.out.println(sbf);
	}
}