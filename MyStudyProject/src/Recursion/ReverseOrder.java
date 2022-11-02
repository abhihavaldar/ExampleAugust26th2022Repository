package Recursion;
class ReverseDemo
{
	void Reverse(int a[])
	{
		for(int i=a.length;i>0;i--)
		{
			
			System.out.println("  +i");
			
		}
	}
}
public class ReverseOrder 
{

	public static void main(String[] args) 
	{
		ReverseDemo obj=new ReverseDemo();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.Reverse(arr);
		

	}

}
