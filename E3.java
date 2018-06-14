import java.util.*;
class E3
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.print("enter no.of elements in the array");
		try
		{
			n=sc.nextInt();
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
		catch(Exception e)
		{
			System.out.println("improper input, it should have been an integer");
		}
	}
}
/*
	we can have nested try-catch mechanisms.
*/

