package Abstract;

//5.HR Inheritance

abstract class Student
{
	
	abstract  void NameShow(String Name);
	abstract  void IdDispaly(int ID);
	
	void Student(int age)
	{
		System.out.println(age);
	}
}
class Deatils extends Student
{
	void NameShow(String Name)
	{
		System.out.println(Name);
	}
	void IdDispaly(int ID)
	{
		System.out.println(ID);
	}
	void address (String Add)
	{
		System.out.println(Add);
	}
}
class Infor extends Deatils
{
	Infor()
	{
		super();
	}
	void NameShow(String Name)
	{
		System.out.println(Name);
	}
	void IdDispaly(int ID)
	{
		System.out.println(ID);
	}
	void address (String Add)
	{
		System.out.println(Add);
	}
	
}
class FullDeatils extends Infor
{
	FullDeatils()
	{
		super();
	}
}



public class Assignment5 {

	public static void main(String[] args) {

		
		Deatils o=new Deatils();
		
		o.NameShow("John");
		o.address("Bng");
		o.IdDispaly(2);
		
		FullDeatils o1=new FullDeatils();

      o1.Student(22);
      
		
	}

}

