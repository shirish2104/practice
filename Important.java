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
	void branch()
	{
		System.out.println("ei");
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
class Important
{
	public static void main(String arg[])
	{
		SMMReddy r;
		r=new SMMReddy();// parent reference, parent object  -- reference & object are of same type
		r.surname();
		r.place();
		//r.branch(); method branch() is not available in SMMReddy
		
		r=new Kavya();  // parent reference, child object  -- valid
		r.surname();
		r.place();
		//r.branch(); NOT VALID
				
		r=new Snehitha(); // parent reference can refer child object
		r.surname();
		r.place();
		//r.branch(); NOT VALID
		
		Snehitha s;
		//s=new SMMReddy(); // child reference cannot refer its parent object
		//s=new Kavya();  // a reference cannot refer its sibling's object
		s=new Snehitha(); // a reference can refer the object of itself or it's child 
		s.surname();
		s.place();
		s.branch();  // Snehitha reference, Snehitha object....so branch() is valid call		
	}
}
/*
a parent class reference can refer it's child class object.

to access a method of child class using its parent reference, that method should also be available in the parent class.

when we have two methods (parent method is overridden in child class), 
and parent reference is referring child object, 
then call to the method will reach to child method.

when we have only one method (in parent only), 
and parent reference is referring child object, 
then call to method would reach to parent method.

when we have only one method (in child only),
and parent reference is referring child object,
then we cannot call that method.

*/
