class Block
{
	final void one() { System.out.println("A");}
	void two() { System.out.println("B");}
	//final abstract void three(); // abstract and final cannot come together
}
class Unit extends Block
{
	// void one() { System.out.println("C");} method one() is final in parent class, so cannot be overridden
	void two() { System.out.println("D");}
	void three(){ System.out.println("E");}
}
class FinalMeth
{
	public static void main(String arg[])
	{
		Unit u=new Unit();
		u.one();
		u.two();
		u.three();
	}
}

/*
when a method is made final, it cannot be overridden in its child classes.
only concrete methods can be made final.
abstract methods cannot be made final.

*/
