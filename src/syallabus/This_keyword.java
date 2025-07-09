package syallabus; 


/*  this keyword is used to refer the current class object 
 *  it is the referance variable of the class object 
 * the main purpose of the this keyword 
 * 	1. to indicate the  instance varible of the class 
 * 2. to call the method in another method 
 * 3. to call the constructor 
 *  4. to call the instance variable
 *  
 * 
 * */
 class Student
 {
	  int a=10;
	  
	  void show()
	  {
		  System.out.println("hello pradip shinde");
		  
	  }
	   void display()
	   {
		   this.show();
		    int a=120;
		   System.out.println(" hello "+ a);
	   }
 }

public class This_keyword 
{
	public static void main(String args[])
	{
		Student s1= new Student();
		s1.display();
	}

}
