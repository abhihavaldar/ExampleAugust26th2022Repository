package polymorphism;
abstract class HumanBehavier
{
	abstract void Attitude();
}
class Moral extends  HumanBehavier
{
	void Attitude()
	{
		System.out.println(" He is a moral boy");
		
	}
	
}
class Optimistic extends  HumanBehavier
{
	void Attitude()
	{
		System.out.println(" He is a Optimistic");
	}
}
class Pessimistic extends  HumanBehavier
{
	void Attitude()
	{
	  System.out.println(" He is a Pessimistic");
	}
	
}
public class Assignment4 {

	public static void main(String[] args) {
		 HumanBehavier att =null;
		 att = new Moral();
		 att.Attitude();
		 att = new Optimistic();
		 att.Attitude();
		 att =new Pessimistic();
		 att.Attitude();
		 
		 

	}

}
