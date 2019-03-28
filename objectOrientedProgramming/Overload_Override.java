package objectOrientedProgramming;

/*
 * Static or early binding is resolved at compile time. Method overloading is an example of static binding.

Dynamic or late or virtual binding is resolved at run time. Method overriding is an example of dynamic binding.
 */

public class Overload_Override {

	// OVERLOADING
	class OverloadingExample {
		int add(int a, int b) {
			return a + b;
		}

		int add(int a, int b, int c) {
			return a + b + c;
		}
	}

	// OVERLOADING-COMPILE TIME ERROR
	class OverloadingCalculation3 {
		void sum(int a, long b) {
			System.out.println("a method invoked");
		}

		void sum(long a, int b) {
			System.out.println("b method invoked");
		}

		public void main(String args[]) {
			OverloadingCalculation3 obj = new OverloadingCalculation3();
			// obj.sum(20, 20);// now ambiguity
		}
	}

	// OVERRIDING

	/*
	 * WHY OVERRIDING
	 * 
	 * Method overriding is used to provide the specific implementation of a method
	 * which is already provided by its superclass. Method overriding is used for
	 * runtime polymorphism
	 * 
	 */

	/*
	 * RULES The method must have the same name as in the parent class The method
	 * must have the same parameter as in the parent class. There must be an IS-A
	 * relationship (inheritance).
	 * 
	 * CANT OVERRIDE STATIC METHOD 
	 * 
	 * It is because the static method is bound with
	 * class whereas instance method is bound with an object. Static belongs to the
	 * class area, and an instance belongs to the heap area.
	 */
	class Animal {
		void eat() {
			System.out.println("eating...");
		}
	}

	class Dog extends Animal {
		void eat() {
			System.out.println("eating bread...");
		}
	}

}
