package String;

public class Assignment6tofindvowels {

	public static void main(String[] args) {
		vowels();
		consonants();
	}
	private static void vowels()
	{
		String s="programming";
		char ch[]=s.toCharArray();
		int count=0;
		for (int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case 'a':case 'e':case 'i':case'o':case'u':
				count++;
				break;
			}
		}
		System.out.println("total vowels is:"+count);
	}
	private static void consonants()
	{
		String s="programming";
		char ch[]=s.toCharArray();
		int count=0;
		int x=s.length();
		for (int i=0;i<ch.length;i++)
		{
			switch(ch[i])
			{
			case 'a':case 'e':case 'i':case'o':case'u':
				count++;
				break;
			}
		}
		System.out.println("total vowels is:"+(x-count));
	}
	

}

