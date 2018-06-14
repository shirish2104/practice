final class Block
{
	void one() { System.out.println("A");}
	void two() { System.out.println("B");}
}

/*
class Unit extends Block
{
	void two() { System.out.println("D");}
	void three(){ System.out.println("E");}
} 
*/

/*
final abstract class List
{
	abstract void hello();
}
*/

class Set
{
}
final class Collect extends Set
{
}

/* as java.lang.String is a final class, we cannot inherit it into our classes.
class First extends String
{
}
 as java.lang.System is a final class, it cannot be a parent class.
class Second extends System
{
}
*/
// java.lang.Exception is not a final class, so it can be extended (inherited)
class FinalClass extends Exception
{
	public static void main(String arg[])
	{
	}
}

/*
a final class cannot be inherited.
it means a final class cannot be a parent class.
a final class cannot have abstract methods. all methods should be concrete.
methods in a final class can be accessed with its object only.
an abstract class cannot be made final class.
a final class can be a child class.

the keyword 'final' is used to fix the meaning/value of an entity.
the entity can be a variable, method or a class.
*/
