package testingClass;

public class JavaProgram {
	
		public static void main(String[] args) {

			int a = 15; 					// Combined Declaration and Initialisation

			System.out.println(a); 			// Variable Usage

			JavaProgram q = new JavaProgram(); // Object creation for calling non static method
			q.test1(1,"str");						// static method calling

			JavaProgram.test2(2); 			//  static method calling by class name
			test2(1);						// directly by method name only
		}

		public void test1(int a, String str) { 				// non static method
			int c = 98;
			System.out.println(c);
		}

		public static void test2(int z) { 		// static method
			int d = 34;
			System.out.println(d);
		}

	}



