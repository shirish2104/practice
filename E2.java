import java.util.*;
class E2
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("enter no.of elements in the array");
		try
		{
			n=sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("improper input, it should have been an integer");
			System.exit(0);
		}
		int a[]=new int[n];
		
		System.out.println("enter the elements");
		for(int i=0;i<n;i++)
		{
			System.out.print("value "+(i)+":");
			try
			{
				a[i]=sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("problem in reading element "+i);
				sc.nextLine();
				i--;
			}
		}
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
				System.out.println(" "+a[i]);
		}
	}
}
/*
	The statements that are supposed to raise an exception (and the statements depending on them)
	are placed in the 'try' block.
	
	if an exception is raised (a problem occured) then control goes to the catch block. 
	otherwise, the catch block is skipped.
	
	the catch block should immediately follow its try block.
*/

