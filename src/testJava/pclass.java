package testJava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class pclass
{
	public static void main(String[] args)
	{
		Set s = new HashSet();
		
		s.add(null);
		s.add(null);
		s.add(10);
		s.add("java");
		
		Iterator it = s.iterator();	
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}