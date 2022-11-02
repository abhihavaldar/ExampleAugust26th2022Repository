package Abstract;

//7. MLI ALL CLASS CONATINS SAME METHOD NAMES
class AAA
{
	void Method()
	{
		System.out.println("Method1");
	}
}
class BB extends AAA
{
	void Method()
	{
		System.out.println("Method2");
	}
}
class c extends BB
{
	void Method()
	{
		System.out.println("Method3");
	}
}


public class Assignment7 {
	public static void main(String[] args) {

		c obj=new c();
		obj.Method();
	}
}

