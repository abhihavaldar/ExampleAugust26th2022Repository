package polymorphism;

abstract class FoodTaste
{
	abstract void Taste();
}
class Jamun extends FoodTaste
{
	void Taste()
	{
		String a= "SWEET";
		System.out.println("Jamun taste is :" +a);
		
	}
	
}
class Pickle extends FoodTaste
{
	void Taste()
	{
		String b = "SALTY";
		System.out.println("Pickle taste is :" +b);
	}
}
class Kharabath extends FoodTaste
{
	void Taste()
	{
		String c = "SPICY";
		System.out.println("Kharabhat taste is :" +c);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		FoodTaste obj = null;
		obj = new Jamun();
		obj.Taste();
		obj= new Pickle();
		obj.Taste();
		obj=new Kharabath();
		obj.Taste();

	}

}
