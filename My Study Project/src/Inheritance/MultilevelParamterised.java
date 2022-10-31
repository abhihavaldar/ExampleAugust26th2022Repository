package Inheritance;

class Grandfather1
{
	Grandfather1(String Name)
	{
		System.out.println("Super class output :"+Name);
	}
}
class Father1 extends Grandfather1
{
	Father1(String name)
	{
		super(name);
	}
	void main(String n)
	{
		System.out.println("sub class output :"+n);
	}
}
class son1 extends Father1
{
	son1(String n)
	{
		super(n);
	}
	void main1(String Name)
	{
		System.out.println("Last class output :"+Name);
	}
}
public class MultilevelParamterised {

	public static void main(String[] args) {
		son1 s=new son1("kamal");
		s.main("kumar");
		s.main("Ramu");
	}
}

