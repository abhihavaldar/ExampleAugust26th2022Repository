package Assignmentfactorialandother;
class Transpose1
{
	void Transpose(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+" ");
				
			}
			System.out.println();
		}
	}
}
public class MethodsofTranspose3x3
{

	public static void main(String[] args)
	{
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		Transpose1 t=new Transpose1();
		t.Transpose(a);
	}
}