package syallabus;

interface Student12 {
	int a = 38;

	abstract void m1();

	abstract void m2();

}

class A23 implements Student12 {
	public void m1() {
		System.out.println(" hello m1 method ");
	}

	@Override
	public void m2() {
		System.out.println(" the given is m2 method");
	}

}

public class abstraction_class {
	public static void main(String args[]) {
		A23 a1 = new A23();
		a1.m2();

	}

}
