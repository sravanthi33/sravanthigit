import java.util.ArrayList;
import java.util.Collection;
public class DemoClass
{
 	public static void main(String[] args) throws Exception
	{
//		int values[] =new int[4];
//		Object Values1[] = new Object[4];
//		values1[0] = "Navin";
//		values1[1] = 7;
		
		Collection<Integer> values =new ArrayList<Integer> ();
		values.add(3);
		values.add(77);
		values.add(88);

		values.remove(77);
		
//		Iterator i =values.iterator();
		

		for(int i : values)
		{
		System.out.println(i);
		}
}
}
