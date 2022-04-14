package programInterface;

public class Completetest implements inter1
{
	
	public void test1()
	{
		System.out.println("completed test1");
	}
	
	public void test2()
	{
		System.out.println("complete test2");
	}
	
	public static void main(String[] args) {
		
		Completetest com = new Completetest();
		com.test1();
		com.test2();
				
	}
}

