package Assignmentfactorialandother;
class TwodArray
{
	void Twodarray(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length-3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
		}
	}
}
public class Firstcolumn2darray 
{

	public static void main(String[] args) 
	{
		int a[][]= {{1,2,3,4},{5,6,7,8}};
		TwodArray obj=new TwodArray();
		obj.Twodarray(a);
	
		

	}

}
