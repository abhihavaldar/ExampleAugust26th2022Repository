package Inheritance;

class E
{
	void show()
	{
		System.out.println("Parent");
	}
}

class F extends E
{
	void show1()
	{
		System.out.println("Child");
		
	}
}

class G extends F
{
	void show2()
	{
		System.out.println("Grand Child");
	}
}

public class Multilevel {

	public static void main(String[] args) {
		
		F i=new F();
		i.show();
		i.show1();
		G o=new G();
		o.show();
		o.show1();
		o.show2();

	}

}
