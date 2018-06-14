class E4
{
	public static void main(String arg[])
	{
		try
		{
			int a=Integer.parseInt(arg[0]);
			int b=Integer.parseInt(arg[1]);
			System.out.println("quo:"+(a/b));
			System.out.println("sum:"+(a+b));		
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("make sure you have given 2 command line arguements");
		}
		catch(NumberFormatException e)
		{
			System.out.println("command line arguments should be ints only");
		}
		catch(Exception e)
		{
			System.out.println("some problem");
		}
	}
}
/*
	a try block can have any number of catch blocks associated with it.
	when an exception is raised, the control check the exception with the first catch block.
	if it matches...then the catch block will be executed.
	otherwise (if first catch block does not match) the control checks the second catch block.
	
	we should make sure that a parent class catch block is always placed after its child 
	class catch block.
	
	when a catch block is matched, the remaining catch blocks will not be checked.
	

	when the control comes from a try block to catch block, it will not go back (after
	executing the catch block) to the try block to execute the remaining statements.	
*/

