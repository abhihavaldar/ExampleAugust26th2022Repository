package Methods;
class EvenNumber
{
	int [] even()
	{
		int count=0;
		for(int i=50;i<=80;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		int g[]=new int[count];
		int i=0;
		for(int p=50;p<=80;p++)
		{
			if(p%2==0)
			{
				g[i]=p;
				System.out.println(g[i]);
				i++;
			}
		}return g;
	}
 }
public class Even
{

	public static void main(String[] args)
	{
		EvenNumber e=new EvenNumber();
		int p[]=e.even();
		for(int b=0;b<p.length;b++)
		{
			System.out.println(p[b]);
		}
		
	}

}
