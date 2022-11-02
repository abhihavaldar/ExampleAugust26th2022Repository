package String;

public class Assignment2Palindrome {

	public static void main(String[] args) {
		
		stringreverse();

	}
	private static void stringreverse()
	{
		String s="AMMA";
		StringBuffer s1=new StringBuffer(s);
		s1.reverse();
		String s2=s1.toString();
		System.out.println(s1);
		System.out.println("--------");
		if(s.equals(s2))
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("not a Palindrome");
		}
	}

}