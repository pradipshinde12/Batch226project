package syallabus;

/*hiding the internal detail and showing the only functionlaty the user 
 * so thats why provide the security to the software
 *  we can achieve the abstraction using two ways 
 *  abstract class and interface
 * 
 * 
 * 
 * */

abstract class Sbc
{
	abstract void show();
	
	void eat()
	{
		System.out.println(" this is normal method ");
	}
	
}

class bop extends Sbc
{
	void show()
	{
		System.out.println(" this is   the abstract method  in implementing in child class");
	}
	
}

public class abstraction_ex 
{

	public static void main(String args[])
	{
		bop b1=new bop();
		b1.show();
		
	}
}
