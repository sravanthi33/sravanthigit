public class StringDemo
{
	public static void main(String args[]) throws Exception
	{
		String str="name1,name2,name3,name4";
		String names[]=str.split(",");
		for(String val:names)
		System.out.println(val);
	}
}