class E5
{
	public static void main(String arg[])
	{
		try
		{
			int b=0;
			int a=Integer.parseInt(arg[0]);
			try
			{
				b=Integer.parseInt(arg[1]);
				System.out.println("quo:"+(a/b));
			}
			catch(ArithmeticException e)
			{
				System.out.println("second value cannot be zero for division");
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("make sure you have given 2 command line arguements");
			}
			System.out.println("sum:"+(a+b));		
		}
		catch(NumberFormatException e)
		{
			System.out.println("command line arguments should be ints only");
		}
	}
}
/*
if none of the available catches can handle the raised exception, then the program (thread)
will be abnormally terminated.

a try can have any number of catch blocks...but only one (matched one) out of them can get executed.

when a try-catch mechanism is placed inside a try block.....
>> exception raised in the outer try cannot be handled by inner catch.
>> exceptions raised in the inner try are handled by inner catch(es). 
   if the inner catch(es) cannot handle any exception, 
   then the system automatically throws that exception to the outer catch.

*/

