class Employee {
	int id; 
	String name;
	int salary;
	public Employee(int id1,String name1,int salary1)
	{
		id=id1;
		name=name1;
		salary=salary1;
	}
	public Employee(String name1)
	{
		name=name1;
	}
	public Employee()
	{
		System.out.println("wipro");
	}
}
class Emp
{
	public static void main(String[] args)
	{
		Employee e=new Employee(1,"Ramu",20000);
		System.out.println(e.id);
		Employee e1=new Employee("Rakesh");
		System.out.println(e1.name);
		Employee e2=new Employee();
		e.name="mahesh";
		System.out.println(e.name);
		e1.name="mukesh";
		System.out.println(e1.name);
	}
}