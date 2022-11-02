package Recursion;
class NumOfDigit
{
	void Digit(int a[])
	{
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println("count of number:"+count);
		
		}
	}
public class NumberOfDigit
{

	public static void main(String[] args)
	{
		NumOfDigit obj=new NumOfDigit();
		int arr[]= {1,2,3,4,5,6};
		obj.Digit(arr);
	}
}