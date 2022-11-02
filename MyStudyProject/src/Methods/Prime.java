package Methods;
class PrimeNumber
{
	int [] prime()
	{
		int cun=0;
		for(int i=10;i<=20;i++)
		{
			int count=0;
			for(int j=1;j<=20;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
		{
			cun++;
		}
	}
		System.out.println("# of prime numers"+cun);
		int h[]=new int[cun];
		int c=0;
		for(int i=0;i<=20;i++)
		{
			int count=0;
			for(int j=1;j<=20;j++)
			{
				if(i%j==0)
				{
				 count++;
				}
			}
			if (count==2)
			{
				h[c]=i;
				c++;
			}
		}return h;
	}
}
public class Prime 
{

	public static void main(String[] args)
	{
		PrimeNumber p=new PrimeNumber();
		int o[]=p.prime();
		for(int i=0;i<o.length;i++)
		{
			System.out.println(o[i]);
		}
		}
}