package Abstract;

//If an abstract class contains parameterized constructor and WAP to execute the parameterized constructor 

abstract class SoftwereTraining
{
	SoftwereTraining(String name, String cityname)
	{
		System.out.println("College name :" +name);
		System.out.println("City  name :" +cityname);
	}
}
class Branch extends  SoftwereTraining
{

	Branch(String name, String cityname)
	{
		super(name, cityname);
		
	}
	
}

public class Assignment1 {

	public static void main(String[] args) {
		Branch o1 = new Branch("VTU"," Belagavi");

	}

}
