package Interface;

interface Testing
{
	void TypeTesting(String typ);
}
interface Development
{
	void TypeDevelopment(String name);
}

abstract class Cources
{
	Cources(String name)
	{
		System.out.println("Course name is " +name);
	}
}
class Software extends Cources implements Testing, Development
{

	Software(String name) {
		super(name);

	}

	public void TypeDevelopment(String name)
	{
		System.out.println("Type of Development is :" +name );

	}


	public void TypeTesting(String typ)
	{

		System.out.println("Type of Testing is :" +typ);
	}

}


public class Assignment4 {

	public static void main(String[] args) {
		Software o =new Software("Automation");
		o.TypeTesting("Manual Testing");
		o.TypeDevelopment("Java Development");


	}

}

