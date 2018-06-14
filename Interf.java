interface Fruit
{
	void size();	
	void color();	
}

interface BigFruit extends Fruit
{
	void where();
}

interface Veg
{
	void taste();
	void eatable();
}

class Tomato implements Fruit,Veg
{
	public void size(){System.out.println("smaller");}
	public void color(){System.out.println("red");}
	public void taste(){System.out.println("sweet/sour");}
	public void eatable(){System.out.println("yes");}
}
class JackFruit implements BigFruit
{
	public void size(){System.out.println("bigger");}
	public void color(){System.out.println("green");}
	public void where(){System.out.println("top");}
}
class WaterMelon implements BigFruit
{
	public void size(){System.out.println("big");}
	public void color(){System.out.println("light/dark green");}
	public void where(){System.out.println("ground");}
}
class Interf
{
	public static void main(String arg[])
	{
		Fruit f=new Tomato();
		f.size();
		f.color();
		//f.taste();   taste() is not a member of Fruit
		//f.eatable();  eatable() is not a member of Fruit
		
		Veg v=new Tomato();
		//v.size();  size() is not a member of Veg
		//v.color();  color() is not a member of Veg
		v.taste();   
		v.eatable();  		
		
		f=new JackFruit();
		f.size();
		f.color();
		//f.where(); where() is not a member of Fruit
		
		BigFruit b=new WaterMelon();
		b.size();
		b.color();
		b.where(); 
	}
}

/*
a class can implement any number of interfaces.
i.e. multiple inheritance is possible with interfaces


*/
