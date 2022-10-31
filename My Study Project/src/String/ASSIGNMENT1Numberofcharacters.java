package String;

public class ASSIGNMENT1Numberofcharacters
{

	public static void main(String[] args) 
	{
		findlength();
	}
	private static void findlength()
	{
		String s="venu";
		int count=0;
		for(int K:s.toCharArray())
		{
			count++;
		}
		System.out.println("Length of String is "+count);
	}

}