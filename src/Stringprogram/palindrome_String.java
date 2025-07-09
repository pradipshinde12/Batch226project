package Stringprogram;

public class palindrome_String 
{
	public static void main(String args[])
	{
		{
			 String s1="101";
			 String rev="";
			 String org=s1;
			 
			 for( int i=s1.length()-1; i>=0; i--)
			 {
				 rev = rev+ s1.charAt(i);
			 }
			 System.out.println(rev);
			 
			 if(org.equals(rev))
			 {
				 System.out.println(" palindrome");
			 }
			 else
			 {
				 System.out.println(" not a palindrome");
			 }
			 
			 
		}
		
	}

}
