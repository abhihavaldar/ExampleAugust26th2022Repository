package String;

public class Assignment5th {

	public static void main(String[] args) {
		reversesentence();
	}
    private static void reversesentence()
    {
    	String s=" The temple is at the top of the hill";
    	String s1[]=s.split(" ");
    	for(int i=s1.length-1;i>=0;i--)
    	{
    		System.out.print(" "+s1[i]);
    	}
    }
}