package Abstract;

//8.MLI ALL CLASS CONATINS SAME VARIABLE NAMES

class A111
{
	String Name;
	void Method1()
	{
		
		System.out.println("Method1: "+Name);
	}
}
class B111 extends A111
{
	String Name;
	B111 (String Name1,String Name2)
	{
		super.Name=Name1;
		this.Name=Name2;
	}
	void Method2()
	{
		
		System.out.println("Method2: "+Name);
	}
}
class Z extends B111
{
	String Name;
	Z(String Name1,String Name2,String Name3)
	{
		super(Name1,Name2);
		this.Name=Name3;
	}
	void Mehod3()
	{
		
		System.out.println("Method3: "+Name);
	}
}
public class Assignment8 {
	public static void main(String[] args) {
		
		Z o=new Z("Jon","peter","king");
		
		
		o.Method1();
		o.Method2();
		o.Mehod3();

	}

}

