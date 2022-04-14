package programInterface;

public interface NewTest extends inter1 , inter2
{
	
	public default void test1()
	{
		System.out.println("implementation of test1 ");
	}
	
	public default void test2()
	{
		System.out.println("implementation of test2 ");
	}
	
	
	
	
}
