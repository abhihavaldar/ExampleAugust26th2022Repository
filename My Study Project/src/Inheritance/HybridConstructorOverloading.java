package Inheritance;

class Super
{
	Super(String name)
	{
		System.out.println("super class output1 :"+name);
	}
	Super(int No)
	{
		System.out.println("super class output2 :"+No);
	}
}
class sub extends Super
{
	sub(String na)
	{
		super(na);
	}
	sub(int N)
	{
		super(N);
	}
}
class sub1 extends Super
{
	sub1(String name)
	{
		super(name);
	}
	sub1(int no)
	{
		super(no);
	}
}
class sub2 extends sub1
{
	sub2(String names)
	{
		super(names);
	}
	sub2(int nu)
	{
		super(nu);
	}
}

public class HybridConstructorOverloading 
{

	public static void main(String[] args) 
	{
		sub s1=new sub("Shine");
		sub s2=new sub(999);
		System.out.println("---------------------------");
		sub2 a1=new sub2("Star");
		sub2 a2=new sub2(11111);
	
	}

}

