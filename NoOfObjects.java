 class NoOfObjects
{
	static int i;
	public NoOfObjects()
	{
		i++;
	}
	public void count()
	{
		System.out.println("Number of objects in present class is "+i);	
	}
	public static void main(String a[])
	{
		NoOfObjects n1=new NoOfObjects();
		NoOfObjects n2=new NoOfObjects();
		NoOfObjects n3=new NoOfObjects();
		n2.count();	
	}
}