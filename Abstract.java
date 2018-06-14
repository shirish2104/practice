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
class Snehitha extends SMMReddy
{
	Snehitha()
	{
		System.out.println("Snehitha constructor");
	}
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
class Abstract
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

when we make a method abstract, its child classes should provide meaning for that method.
otherwise a compilation error would be generated.

an abstract method should not contain any method block. 
its declaration should end with a semi-colon.

when a class has one or more abstract methods, that class becomes partial (incomplete) class.
such a class should be declared as abstract.

a method should be concrete or abstract.
concrete method should have a method body.
abstract method should not have a method body.

we cannot create objects of abstract classes.
but we can create references of abstract classes.
these references are generally used to refer the child class objects.

an abstract class can have both concrete methods and abstract methods.
an abstract class can also have constructor like normal classes and they will be invoked from child constructors.

*/
