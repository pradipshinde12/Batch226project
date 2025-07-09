/*
 *  the process of creating the new class from the 
 *  existing class  is known as  inheritance 
 *  
 *  when the one object acquire all the properties of  the parent class  into the its
 *  subclass that is known as inheritance 
 *   its save the time 
 *   its save the memory 
 *   we can  reuse the code again and again so thats why we don't need to define
 *   
 *    we can achieve the method overriding using the inheritance only  so thats why 
 *    inheritance the most important
 *    
 *     there are few types of the  the inheritance 
 *     single level
 *     multilevel
 *     multipal
 *     hierachical
 *     hybrid
 *     and cyclic
 * 
 * 
 * 
 * 
 * */


package syallabus;
class parent
{
	void m1()
	{
		System.out.println(" the parent class method ");
	}
}

class Child extends parent
{
	
	
	void m2()
	{
		System.out.println(" the  child class method ");
	}
}

public class Method_overriding
{
	public static void main(String args[])
	{
		parent c1= new Child();
		c1.m1();
		
	}

}
