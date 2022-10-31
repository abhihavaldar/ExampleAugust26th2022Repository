package Interface;

interface Mobile
{
	void showName(String name);
}
interface Loptap extends Mobile
{
	void displayBrand(String name);
}
interface Notepad extends Mobile
{
	void TellName(String name);
}
class Device implements Notepad
{
	public void showName(String name)
	{
		System.out.println("Mobile name is :" +name);
	}
	public void displayBrand(String name)
	{
		System.out.println(" Laptop brand name is :" +name);
	}
	public void TellName(String name)
	{
		System.out.println("Tell the name of notepad :" +name);
	}
}

public class Assignment2 {

	public static void main(String[] args) {
		Device o = new Device();
		o.showName("OnePluse");
		o.displayBrand("Acer");
		o.TellName("Samsung");


	}

}
