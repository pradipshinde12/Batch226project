package Stringprogram;

public class charatoddandeven
{
	public static void main(String args[])
	{
		String s1="pradip shinde";
		
		for(int i=0; i<=s1.length()-1; i++)
		{
			//char ch=s1.charAt(i);
			
			if(i%2==0)
			{
				System.out.println(" the char at even positons : " +s1.charAt(i));
			}
			
		}
		
		for (int i=0; i<s1.length(); i++)
		{
			if(i%2!=0)
			{
				System.out.println(" the char at odd positions : "+s1.charAt(i));
			}
		}
	}

}
