package syallabus;

class A {
	int a = 20;

	void show() {
		System.out.println(" this is a super class method");
	}

}

class B extends A {
	int b = 30;

	void display() {
		super.show();
		System.out.println(super.a);
		System.out.println(" this is a child class method ");

	}
}

public class super_keyword {
	public static void main(String args[]) {
		B b1 = new B();
		b1.display();
	}

}
