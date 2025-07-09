package Stringprogram;

 /*
  *  to count the how many words are present in the sentences so thats the program 
  * */
public class count_the_word 
{
	public static void main(String args[])
	{
		 String s1=" hello pradip shinde i am from nanded";
		 String word[]=s1.trim().split("\\s+");
		 System.out.println(word.length);
	}

}
