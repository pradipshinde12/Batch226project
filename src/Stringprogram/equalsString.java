package Stringprogram;
import java.util.*;
public class equalsString {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" enter two string ");
		
		String s1=sc.next();
		String s2=sc.next();
		
		if(s1==s2)
		{
			System.out.println("equals string ");
		}
		else
		{
			System.out.println(" not equal string");
		}
	}

}
