package Recursion;
class FibnocciNumber
{
	int Fib(int m)
	{
		if(m==0||m==1)
		{
			return m;
		}
		return (Fib(m-1)+Fib(m-2));
	}
}
public class Fibnocci 
{

	public static void main(String[] args) 
	{
		FibnocciNumber obj=new FibnocciNumber();
		int res=obj.Fib(10);
		System.out.println(res);
		
		
	}

}
