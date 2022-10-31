package Abstract;

//In a Multilevel inheritance superclass in an abstract class it has constructor constructor overloading.  
abstract class laptop
{
	laptop(String brand)
	{
		System.out.println("Brand name is :" +brand);
	}

	laptop(int price)
	{
		System.out.println("laptop price is :" +price);
	}
}
class mobile extends laptop
{

	mobile(String brand)

	{
		super(brand );


	}
	mobile(int price)
	{
		super(price);
	}

}
class note extends mobile
{

	note(String brand) {
		super(brand);

	}
	note(int price)
	{
		super( price);
	}
}


public class Assignment2 {

	public static void main(String[] args) {

		note obj =new note("Samsung");
		note obj1= new note(100000);

	}

}
