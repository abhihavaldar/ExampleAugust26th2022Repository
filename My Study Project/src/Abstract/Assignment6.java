package Abstract;

//6.
abstract class AbstractOne
{

	abstract void Person(String PersonName);
	abstract void Age(int age);
}
abstract class Two
{
	abstract void Person(String PersonName);
	abstract void Age(int age);
}
class  Deatil extends AbstractOne
{

	void Person(String PersonName)
	{

		System.out.println(PersonName);
	}

	void Age(int age) 
	{

		System.out.println(age);
	}

}
class information1 extends Two
{
	void Person(String PersonName)
	{

		System.out.println(PersonName);
	}

	void Age(int age) {

		System.out.println(age);
	}

}

public class Assignment6 {
	public static void main(String[] args) {


		Deatil o=new Deatil();

		o.Age(25);
		o.Person("Peter");

		information1 o1=new information1();

		o.Age(22);
		o.Person("king");

	}

}
