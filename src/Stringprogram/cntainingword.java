package Stringprogram;

public class cntainingword
{
	public static void main(String args[])
	{
		String s1="  i really want to go to village but i cant go to the village";
		String s3="go";
		
		if(s1.contains(s3))
		{
			System.out.println(" the word is present in the sentence");
		}
		else
		{
			System.out.println(" the word is not  present  in the sentence ");
		}
	}

}
