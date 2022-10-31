package Assignmentfactorialandother;
class Factorial
{
	void factorial(int fact,int num)
	{
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println("factorial result"+fact);
	}
}
public class MethodsFactorial 
{

	public static void main(String[] args) 
	{
		Factorial obj=new Factorial();
		obj.factorial(1,5);
		obj.factorial(1,7);
		obj.factorial(1,4);

	}

}
