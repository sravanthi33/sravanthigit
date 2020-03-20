interface Animal
{
	public void animalSound();
	public void sleep();
}
class Pig implements Animal
{
	public void animalSound()
	{
		System.out.println("Pig says : Wee Wee");
	}
	public void sleep()
	{
		System.out.println("Zzz");
	}
}
class InterfaceDemo
{
	public static void main(String[] args)
	{
		Pig p=new Pig();
		p.animalSound();
		p.sleep();
	}
}