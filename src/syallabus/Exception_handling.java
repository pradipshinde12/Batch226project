package syallabus;

public class Exception_handling {
	 public static void main(String args[])
	 {
		  try 
		  {
				/*
				 * int a=10/0; System.out.println(a);
				 */
			   int a[]= {1,2,3,4,5,6,7,8};
			
				  System.out.println(a[1]);
			 
		  }catch (ArithmeticException e) {
			 System.out.println(e.getMessage());
			
		}
	 }

}
