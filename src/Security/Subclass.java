package Security;

public class Subclass extends TestingClass { // concrete class

	public void withdraw() // provided body to incomplete method
	{
		System.out.println("completed method withdraw");
	}

	public void test2() // provided body to incomplete method
	{
		System.out.println("print test2");
	}

	public static void main(String[] args) {

		Subclass sub = new Subclass();
		sub.test1();
		sub.test2();
		sub.withdraw();

	}
}