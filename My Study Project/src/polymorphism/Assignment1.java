package polymorphism;

abstract class AnimalSounds
{
	abstract void sound();
}
class Dog extends AnimalSounds
{
	void sound()
	{
       String dog ="WOOF";
       System.out.println("Dog sounds :" +dog);
	}
}
class Cat extends AnimalSounds
{
	void sound()
	{
	       String cat = "MEOW";
	       System.out.println("Cat sounds :" +cat);
	}
}

public class Assignment1 {

	public static void main(String[] args) {
		AnimalSounds Voice  = null;
		Voice = new Dog();
		Voice.sound();
		Voice = new Cat();
		Voice.sound();
		

	}

}
