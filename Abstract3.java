abstract class SMMReddy
{
	SMMReddy()
	{
		System.out.println("SMMReddy constructor");
	}
	void surname()
	{
		System.out.println("\nsama");
	}
	void place()
	{
		System.out.println("karimnagar");
	}
	abstract void branch();
}
abstract class Snehitha extends SMMReddy
{
	Snehitha()
	{
		System.out.println("Snehitha constructor");
	}
	void place()
	{
		System.out.println("Rourkela");
	}
}

class NIT extends Snehitha
{
	NIT()
	{
		System.out.println("NIT constructor");
	}
	void branch()
	{
		System.out.println("electornics instr");
	}
	void surname()
	{
		System.out.println("SAMA");
	}
}

class Kavya extends SMMReddy
{
	Kavya()
	{
		System.out.println("Kavya constructor");
	}
	void place()
	{
		System.out.println("Sikkim");
	}
	void branch()
	{
		System.out.println("ec");
	}
}
class Abstract3
{
	public static void main(String arg[])
	{
		SMMReddy r;
		
		r=new Kavya();
		r.surname();
		r.place();
		r.branch();
				
		//r=new Snehitha(); // cannot create object for abstract class
		
		r=new NIT();
		r.surname();
		r.place();
		r.branch();		
	}
}

/*

when a child class does not override all abstract methods of its parent class then the 
child class should be declared as abstract. in that case, we cannot create object for
the child class also.
*/
