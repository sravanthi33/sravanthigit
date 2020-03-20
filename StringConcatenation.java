import java.util.Scanner;
public class StringConcatenation
{
	public static void main(String args[])
	{
		String s1,s2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 strings");
		s1=sc.nextLine();
		s2=sc.nextLine();
		String s3=s1.concat(s2);
		System.out.println("Result on concatenation is :"+s3);
	}
}	
		