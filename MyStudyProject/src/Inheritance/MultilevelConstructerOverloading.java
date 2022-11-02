package Inheritance;

class Employee
{
	Employee(String ename)
	{
		System.out.println("Super class output1 :"+ename);
	}
	Employee(int empno)
	{
		System.out.println("Super class output2 :"+empno);
	}
}
class Department1 extends Employee
{
	Department1(String s)
	{
		super(s);
	}
	Department1(int deptno)
	{
		super(deptno);
	}
}
class Department2 extends Department1
{
	Department2(String s1)
	{
		super(s1);
	}
	Department2(int dept1)
	{
		super(dept1);
	}
}
public class MultilevelConstructerOverloading
{
  public static void main(String[] args) 
  {
		Department2 d=new Department2("Ramu");
		Department2 d1=new Department2(222);

	}

}
