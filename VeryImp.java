class SMMReddy
{
	void surname()
	{
		System.out.println("sama");
	}
	void place()
	{
		System.out.println("karimnagar");
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
}
class VeryImp
{
	public static void main(String arg[])
	{
		SMMReddy r;
		r=new SMMReddy();// parent reference, parent object  -- reference & object are of same type
		r.surname();
		r.place();
		
		r=new Kavya();  // parent reference, child object  -- valid
		r.surname();
		r.place();
		
		r=new Snehitha(); // parent reference can refer child object
		r.surname();
		r.place();
		
		Snehitha s;
		s=new SMMReddy(); // child reference cannot refer its parent object
		s=new Kavya();  // a reference cannot refer its sibling's object
		s=new Snehitha(); // a reference can refer the object of itself or it's child 
		
		
	}
}
/*
a parent class reference can refer it's child class object.
*/
