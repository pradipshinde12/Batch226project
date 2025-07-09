package Stringprogram;

public class ToCharArray 
{
	public static void main(String args[])
	{
		String s1=" hello pradip";
		char arr[]=s1.toCharArray();
		
		for(char c:arr)
		{
			System.out.println(c);
		}
	}
}
