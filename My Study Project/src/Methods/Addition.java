package Methods;
class AdditionDemo
{
	int[][] matrix(int a[][],int b[][])
	{
		System.out.println("addition of matrices");
		int c[][]=new int[b[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.println(c[i][j]+" ");
			}System.out.println();
		}
		return c;
	}
}
public class Addition
{

	public static void main(String[] args)
	{

	AdditionDemo o=new AdditionDemo();
	int x[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int y[][]= {{1,2,3},{4,5,6},{7,8,9}};
	int h[][]=o.matrix(x,y);
	System.out.println("Transpose of matrix");
	int f[][]=new int[h.length][h.length];
	for(int i=0;i<h.length;i++)
	{
		for(int j=0;j<h.length;j++)
		{
			f[i][j]=h[j][i];
			System.out.print(f[i][j]+" ");
		}System.out.println();
	}
}

}
