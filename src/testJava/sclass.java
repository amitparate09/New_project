package testJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class sclass
{
	public static void main(String[] args)
	{
		List l = new ArrayList(); 		// up casting

		l.add(null);
		l.add(null);
		l.add(30);
		l.add("class");

		Iterator it = l.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}