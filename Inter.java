/*
abstract class Fruit
{
	abstract void size();
	abstract void color();
}
*/
interface Fruit
{
	void size();	// public abstract void size();
	void color();	// public abstract void color();
}

class Mango implements Fruit
{
	public void size() { System.out.println("medium"); }
	public void color() { System.out.println("yellow"); }
}

class Apple implements Fruit
{
	public void size() { System.out.println("medium"); }
	public void color() { System.out.println("red"); }
}
abstract class Grape implements Fruit
{
	public void size() { System.out.println("small"); }
}

class BlackGrape extends Grape
{
	public void color() { System.out.println("purple"); }
}

class WhiteGrape extends Grape
{
	public void color() { System.out.println("green"); }
}

class Inter
{
	public static void main(String arg[])
	{
		// Fruit f1=new Fruit(); object cannot be created for Fruit
		
		Fruit f2;
		Fruit f3;
		f2=new Mango();
		f2.size();
		f2.color();
		f2=new Apple();
		f2.size();
		f2.color();
		//f3=new Grape(); Grape is abstract, so cannot create object of it.
		f3=new BlackGrape();
		f3.size();
		f3.color();
		f3=new WhiteGrape();
		f3.size();
		f3.color();
	}
}

/*
an interface is similar to an abstract class but it does not contain any concrete methods.
all methods in an interface are abstract by default.
all methods in an interface are public by default.

we cannot create object of an interface.
we can create references of interfaces.

a class implementing an interface should override all the methods of the interface.
otherwise that class should be declared as abstract.

an interface reference can refer any of its child class objects.

*/
