package polymorphism;

abstract class WorkCulture
{
	abstract void Nature();
}
class Teacher extends WorkCulture
{
	void Nature()
	{
		System.out.println(" He is a Teacher");

	}
}
class Clerk extends WorkCulture
{
	void Nature()
	{
		System.out.println(" He is a clerk");
	}
}
class Peon extends WorkCulture
{
	void Nature()
	{
		System.out.println(" He is a Peon");
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		WorkCulture ntr = null;
		ntr = new Teacher();
		ntr.Nature();
		ntr = new Clerk();
		ntr.Nature();
		ntr = new Peon();
		ntr.Nature();

	}

}
