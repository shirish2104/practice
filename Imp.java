class SMMReddy
{
	void surname()
	{
		System.out.println("\nsama");
	}
	void place()
	{
		System.out.println("karimnagar");
	}
	void branch() // this is kept empty intentionally, child classes may give meaning
	{	
	}
}
class Snehitha extends SMMReddy
{
	void place()
	{
		System.out.println("Rourkela");
	}
}
class Kavya extends SMMReddy
{
	void place()
	{
		System.out.println("Sikkim");
	}
	void branch()
	{
		System.out.println("ec");
	}
}
class Imp
{
	public static void main(String arg[])
	{
		SMMReddy r;
		
		r=new Kavya();
		r.surname();
		r.place();
		r.branch();
				
		r=new Snehitha();
		r.surname();
		r.place();
		r.branch();
		
	}
}
/*

*/
