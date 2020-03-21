import java.util.Scanner;
public class ScannerDemo
{
	public static void main(String args[])
	{
		String str="";
		int i=0;
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		i=Integer.parseInt(sc.nextLine());
		System.out.println("Hello "+str);
		System.out.println("I is "+i);
	}
}