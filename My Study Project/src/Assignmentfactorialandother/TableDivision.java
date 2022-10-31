package Assignmentfactorialandother;
class TableMethod
{
	void Tables(int a)
	{
		for(int i=0;i<=10;i++)
		{
			int res=a*i;
			{
				System.out.println(a+" * "+i+"="+res);
			}
		}
	}
}
public class TableDivision 
{

	public static void main(String[] args) 
	{
		TableMethod m=new TableMethod();
		m.Tables(2);
		System.out.println();
		m.Tables(5);
		System.out.println();
		m.Tables(8);
		

	}

}
