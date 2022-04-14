package testingClass;

public class SubClass extends Superclass {

	public void method1(int i) {

		System.out.println("child method");
	}

	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.method1(0);

	}

}
