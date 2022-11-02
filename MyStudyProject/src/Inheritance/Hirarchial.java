package Inheritance;

class AA
{
	void display()
	{
		System.out.println("Parent class");
	}
}

class BB extends AA
{
	void display1()
	{
		System.out.println("Child class 1");
	}
}

class CC extends AA
{
	void display2()
	{
		System.out.println("child class 2");
	}
}



public class Hirarchial
{

	public static void main(String[] args)
	{
		
		BB o=new BB();
		o.display1();
		o.display();
		
		CC i=new CC();
		i.display2();
		i.display();
		

	}

}

