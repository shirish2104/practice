abstract class SMMReddy
{
	void surname()
	{
		System.out.println("\nsama");
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
class Abstract2
{
	public static void main(String arg[])
	{
		SMMReddy r;
		
		r=new Kavya();
		r.surname();
		r.place();
				
		r=new Snehitha();
		r.surname();
		r.place();
	}
}
/*
a class can be made abstract even though it does not contain any abstract methods.
this approach is used when we dont want to allow creation of objects fro that particular class.


*/
