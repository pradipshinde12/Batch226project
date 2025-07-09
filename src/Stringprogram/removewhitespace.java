package Stringprogram;

public class removewhitespace
{
	public static void main(String args[])
	{
		String s1=" pradip ravsaheb shinde";
		String s2=s1.replaceAll("\\s+", "");
		
		System.out.println("with space : "+s1);
		System.out.println("with no space : " +s2);
	}

}
