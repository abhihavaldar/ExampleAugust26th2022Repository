package Recursion;
class DigitDemo
{
	void Digit01(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of number:"+sum);
			
		}
	}
public class Digit
{

	public static void main(String[] args) 
	{
		DigitDemo obj=new DigitDemo();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.Digit01(arr);
	}
	

	}


