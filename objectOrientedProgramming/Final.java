package objectOrientedProgramming;

/*
 * The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:
variable
method
class


If you make any variable as final, you cannot change the value of final variable(It will be constant.
 */

/*
 * 
 */
public class Final {

	class Bike9 {
		final int speedlimit = 90;// final variable

		void run() {
			// ERROR-> speedlimit=400;
		}

		public void main(String args[]) {
			Bike9 obj = new Bike9();
			obj.run();
		}
	}// end of class

	// If you make any method as final, you cannot override it.
	class Bike {
		final void run() {
			System.out.println("running");
		}
	}

	class Honda extends Bike {
		// ERROR-> CANT OVERRITE void run(){System.out.println("running safely with
		// 100kmph");}

		public void main(String args[]) {
			Honda honda = new Honda();
			honda.run();
		}
	}

	// If you make any class as final, you cannot extend it. <- COMPILE TIME ERROR

	// Que) Can we initialize blank final variable --->Yes, but only in constructor.

	// Q) Can we declare a constructor final? ->No, because constructor is never
	// inherited.
}
