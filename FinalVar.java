class Block
{
	int a=1;
	int b=2;
	static int c=3;
	final static int d=4;
	//final static int e;
	void show(){System.out.println(a+" "+b+" "+c+" "+d);}
}
class FinalVar
{
	public static void main(String arg[])
	{
		Block b1=new Block();
		Block b2=new Block();
		b1.a=5;
		b1.c=6;
		//b1.d=7;
		b1.show();
		b2.show();
		System.out.println(b1.e);
	}
}

/*
value of a final variable cannot be changed in course of the program.
a final variable should be initialized at its declaration (creation).
it is recommended to make only the static variables as final.
making instance variables as final does not make sense.

*/
