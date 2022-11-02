package Methods;
class Substractionreturn
{
	int [][] matrixa()
	{
		int y[][]= {{2,2},{2,2}};
		return y;
	}
	int[][] matrixb()
	{
		int x[][]= {{1,1},{1,1}};
		return x;
	}
	int [][] matrixc(int d[][],int e[][]){
		int c[][]=new int [2][2];
		for(int i=0;i<=c.length-1;i++)
		{
			for(int j=0;j<=c.length-1;j++)
			{
				c[i][j]=d[i][j]-e[i][j];
				System.out.print(c[i][j]);
			}
			System.out.println();
		}return c;
	}
}
public class Substraction
{

	public static void main(String[] args)
	{
	Substractionreturn s=new Substractionreturn();
	int x[][]=s.matrixa();
	int y[][]=s.matrixb();
	s.matrixc(x,y);

	}

}
