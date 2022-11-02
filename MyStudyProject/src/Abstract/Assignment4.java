package Abstract;

abstract class Films
{
	 static String filmname;
	static String Dirname;
	
	static
	{
		filmname="KANTARA";
		Dirname="Rishab shetty";
		
		System.out.println("Name of the film :"+filmname );
		System.out.println("Name of the Director :" +Dirname);
		
	}
}
class Director extends Films
{
   Director()
	{
	super();
	}
}
public class Assignment4 {

	public static void main(String[] args)
	{
		Director obj = new Director();
		

	}

}
