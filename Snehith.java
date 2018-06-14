/**
we have created a class named Snehitha here. we have not mentioned any parent class to 
Snehitha. in such cases (where we dont specify a parent class) the system automatically
makes "thObject" as the class.
*
class Snehith
{
	public static void main(String arg[]) 
	{
		main();
		Snehitha.main();
		//hyd();
		//Snehitha.hyd();	
		Snehitha s=new Snehitha();
		s.karimnagar();
		s.hyd();
		s.rourkela(10,"hi");
	}
	static void main()
	{
		System.out.println("normal main");
	}
	void karimnagar()
	{
		System.out.println("my home");
	}
	void rourkela(int a,String b)
	{
		System.out.println("present");
	}
	void hyd()
	{
		System.out.println("inter");
	}	
}
/* 
we can create object of the main class also. by doing so we can invoke non-static of the 
class from the created object.
*/
