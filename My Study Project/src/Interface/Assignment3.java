package Interface;

interface Kannada
{
	void stateKarnataka(String name);
}
interface Tamil extends Kannada
{
	void stateTamilnadu(String name);
}
interface Telagu extends Kannada
{
	void stateAndra(String name);
}
interface Hindi extends Telagu
{
	void stateUttarapradesh(String name);
}
class Language implements Telagu
{
	public void stateKarnataka(String name)
	{
		System.out.println(" Karnataka :" +name);
	}
	public void stateTamilnadu(String name)
	{
		System.out.println("Tamilnadu :" +name);
	}
	public void stateAndra(String name)
	{
		System.out.println("Andrapradesh :" +name);
	}
	public void stateUttarapradesh(String name)
	{
		System.out.println("Uttarapradesh :" +name);
	}
}
public class Assignment3 {

	public static void main(String[] args) {
		Language o = new Language();
		o.stateKarnataka("KANNADA");
		o.stateTamilnadu("TAMIL");
		o.stateAndra("TELAGU");
		o.stateUttarapradesh("UTTARA PRADESH");

	}

}
