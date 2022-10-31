package polymorphism;

abstract class FlowerColor
{
	abstract void Look();
}
class Jasmine extends  FlowerColor
{
	void Look() 
	{
	  String a= "WHITE";
	  System.out.println("The color of jasmine :" +a);
	}
}
class Rose extends  FlowerColor
{
	void Look()
	{
	    String b = "RED";
	    System.out.println(" The color of Rose :" +b);
	    
	}
}
class SunFlower extends  FlowerColor
{
	void Look()
	{
		String c = "YELLOW";
		System.out.println("The color of Sunflower :" +c);
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		 FlowerColor clr = null;
		 clr = new Jasmine();
		 clr.Look();
		 clr = new Rose();
		 clr.Look();
		 clr = new SunFlower();
		 clr.Look();

	}

}
