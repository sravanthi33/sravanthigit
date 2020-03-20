import java.util.Scanner;
public class StringToUpper
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		s1=s1.toUpperCase();
		s2=s2.toUpperCase();
		System.out.println("1st string in upper case :"+s1);
		System.out.println("1st string in upper case :"+s2);
	}
}	
		