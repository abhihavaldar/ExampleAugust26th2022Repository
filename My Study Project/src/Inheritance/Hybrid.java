package Inheritance;

class B1
{
	void display()
	{
	System.out.println("Parent");
	}
}
class C1 extends B1
{
	void display2()
	{
		System.out.println("Child1");
	}
}
class D1 extends B1
{
	void display3()
	{
		System.out.println("Child2");
	}
}
class E1 extends D1
{
	void display4()
	{
		System.out.println("Child3");
	}
}
public class Hybrid {

	public static void main(String[] args) {
		C1 o=new C1();
		o.display();
		o.display2();
		D1 k=new D1();
		k.display();
		k.display3();
		E1 l=new E1();
		l.display();
		l.display3();
		l.display4();

	}

}
