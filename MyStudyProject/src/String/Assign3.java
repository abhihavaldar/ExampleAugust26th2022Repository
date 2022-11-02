package String;
public class Assign3
{

	public static void main(String[] args) {
		stringreverseTOcharArray();
		reverseTocharat();
		reversesubstring();

	}

	private static void stringreverseTOcharArray()
	{
		String s="VENU";
		char ch[]=s.toCharArray();

		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.print(ch[i]);
		}
		System.out.println("--------------");
	}
	private static void reverseTocharat()
	{
		
		String s="prabhakar";
		char c;
		for (int i=s.length()-1;i>=0;i--)
		{
			c=s.charAt(i);
			System.out.print(c);
		}
		System.out.println("----------------");
	}
	private static void reversesubstring()
	{
		String s="INDIA";
		int l=s.length();
		for(int i=l;i>0;i--)
		{
			System.out.print(s.substring((i-1),i));
		}
	}
}