package Stringprogram;

public class count_vowelandconsonent 
{
	 public static void main(String args[])
	 {
		 String str=" pradip shinde";
		 int v=0,c=0;
		 str=str.toLowerCase();
		 
		 for(int i=0; i<=str.length()-1; i++)
		 {
			 char ch=str.charAt(i);
			 
			 if(ch>'a'&& ch<='z')
			 {
				 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				 {
					 v++;
				 }
				 else
				 {
					 c++;
				 }
			 }
		 }
		 
		 System.out.println("vowel : "+v);
		 System.out.println("consonent :"+c);
	 }

}
