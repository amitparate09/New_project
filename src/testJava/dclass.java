package testJava;

public class dclass
{
	public static void main(String[] args)
	{
		int[] a = { 2, 3 };

		int b = 2;
		int c = 0;
		

		try 
		{
			int d = b/c;
			System.out.println(d);
			System.out.println(a[3]);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println("arithmetic exception");
		} 
		catch (ArrayIndexOutOfBoundsException f) 
		{
			System.out.println("out of bound");
		}
	}
}