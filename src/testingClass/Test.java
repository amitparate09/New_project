package testingClass;

public class Test {

	int num1;			// instance variables 
	int num2;
	int num3;
	
	public Test()			// zero parameter constructor
	{
		num1 = 10;
		num2 = 20;
		num3 = 30;
	}

	public Test(int a)		// single parameter constructor
	{
		this.num1 = a;
	}
	
	public Test(int a, int b)	// two parameter constructor
	{
		this.num1 = a;
		this.num2 = b;
	}
	
	public Test(int a, int b, int c)	// three parameter constructor
	{
		this.num1 = a;
		this.num2 = b;
		this.num3 = c;
	}
	
	public void addition()		// method for addition
	{
		int sum = num1 + num2 + num3;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		Test t1 = new Test();	
		t1.addition();
		
		Test t2 = new Test(100);	
		t2.addition();
		
		Test t3 = new Test(80,90);
		t3.addition();
		
		Test t4 = new Test(70,80,90);
		t4.addition();
		
	}
}
