public class EncapsulationDemo2
{
	public static void main(String args[])
	{	
		Emp e1=new Emp();
		e1.setEmpId(33);
		e1.setEmpName("Sravanthi");
		Emp e2=new Emp();
		e2.setEmpId(25);
		e2.setEmpName("Barathi");
		System.out.println(e1.getEmpName());
		System.out.println(e2.getEmpName());
	}
}
class Emp
{
	private int empId;
	private String empName;
	public int getEmpId()
	{
		return empId;	
	}
	public void setEmpId(int empId)
	{
		this.empId=empId;
	}
	public String getEmpName()
	{
		return empName;	
	}
	public void setEmpName(String empName)
	{
		this.empName=empName;
	}
}	