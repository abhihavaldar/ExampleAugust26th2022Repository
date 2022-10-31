package Inheritance;
class AAA
{
	String flower;
	void method1()
	{
		System.out.println("super class output :"+flower);
	}
}
class BBB extends AAA
{
	String flower;
	BBB(String f1,String f2)
	{
		super.flower=f1;
		this.flower=f2;
	}
	void method2()
	{
		System.out.println("sub class output1 :"+flower);
	}
	
}
class CCC extends BBB
{
	String flower;
	CCC(String f1,String f2,String f3)
	{
		super(f1,f2);
		this.flower=f3;
	}
	void method3()
	{
		System.out.println("sub class output2 :"+flower);
	}
}
public class MultilevelSameVariable {

	public static void main(String[] args) {
		CCC a=new CCC("Rose","Lilly","Sunflower");
		a.method1();
		a.method2();
		a.method3();

	}

}

