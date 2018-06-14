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
		catch(Exception e) //creates problems
		{
			System.out.println("some problem");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("make sure you have given 2 command line arguements");
		}
		catch(NumberFormatException e)
		{
			System.out.println("command line arguments should be ints only");
		}
	}
}
/*
*/

