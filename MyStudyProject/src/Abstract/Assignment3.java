package Abstract;

abstract class subject
{
	static void read(String subname, String auther)
	{
		System.out.println("Subject name is :" +subname);
		System.out.println("Auther name is:" +auther);

	}
}
class physics extends subject
{
	physics()
	{
		super();
	}


}
public class Assignment3 {

	public static void main(String[] args) {
		subject.read("core java", " willam");



	}

}
