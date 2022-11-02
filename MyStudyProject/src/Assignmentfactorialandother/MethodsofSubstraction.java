package Assignmentfactorialandother;
class Substraction
{
	void substraction(int a[][],int b[][],int c[][])
	{
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
public class MethodsofSubstraction
{

	public static void main(String[] args)
	{
		int a[][]= {{4,4},{4,4}};
		int b[][]= {{2,2},{2,2}};
		int c[][]=new int[a.length][a[0].length];
		
		Substraction obj=new Substraction();
		obj.substraction(a,b,c);
		

	}

}
