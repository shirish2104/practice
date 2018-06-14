class Block
{
	void one() { System.out.println("A");}
	public void two() { System.out.println("B");}
	protected void three(){ System.out.println("B");}
	private void four(){ System.out.println("B");}
}

class Unit extends Block
{	
	public void one() { System.out.println("F");}
	public void two() { System.out.println("D");}
	public void three(){ System.out.println("E");}
	public void four(){ System.out.println("C");}
}

class Set extends Block
{
	protected void one() { System.out.println("C");}
	protected void three(){ System.out.println("E");}	
 	protected void four(){ System.out.println("D");}	
	// void two() { System.out.println("D");} // should be public
}

class Stack extends Block
{
	//void three(){ System.out.println("E");}	
 	void four(){ System.out.println("E");}	
}
class PublicUse
{
	public static void main(String arg[])
	{
		Unit u=new Unit();
		Set s=new Set();
		Stack st=new Stack();
		u.four();
		s.four();
		st.four();
		Block b;
		
		b=u; 
		b.one();
		//b.four();
		
		b=s; 
		b.one();
		//b.four();
		
		b=st; 
		b.one();
		//b.four();
	}
}

/*
when a method in parent class is public, its overridden version in child class should also be public.
we should not decrease the freedom (access specification) of a method.
a protected method in parent class can be 'public' or 'protected' in child.
*/
