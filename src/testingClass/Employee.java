package testingClass;

public class Employee {

	String name ; 				// Instance variable
	int Eid; 					// Instance variable

	
	 Employee(String name, int Eid) {
		
		 this.name = name;
		 this.Eid = Eid;
		 
	}
	
	
	
	public void Display()
	{
		System.out.println(name +" "+ Eid);
	}
	public static void main(String[] args) {
		
		Employee e1 = new Employee("amit",101);
		
		e1.Display();
		
				
	}
	
	
}
