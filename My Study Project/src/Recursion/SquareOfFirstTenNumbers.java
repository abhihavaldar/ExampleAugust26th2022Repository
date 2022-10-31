package Recursion;
class SquareOfNumbers
{
	int Square(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return Square(n-1)+2*n-1;
	}
}
public class SquareOfFirstTenNumbers 
{

	public static void main(String[] args) 
	{
		SquareOfNumbers obj=new SquareOfNumbers();
		int res=obj.Square(5);
		System.out.println(res);
	}
}
