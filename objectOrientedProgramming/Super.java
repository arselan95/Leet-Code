package objectOrientedProgramming;

/*JAVA SUPER WORD
 * 
 * super can be used to refer immediate parent class instance variable.
super can be used to invoke immediate parent class method.
super() can be used to invoke immediate parent class constructor.
 */
public class Super {

	// #1 <- REFER INSTANCE VARIABLE
	class Animal {
		String color = "white";
	}

	class Dog extends Animal {
		String color = "black";

		void printColor() {
			System.out.println(color);// prints color of Dog class
			System.out.println(super.color);// prints color of Animal class
		}
	}

	class TestSuper1 {
		public void main(String args[]) {
			Dog d = new Dog();
			d.printColor();
		}
	}

	// #2 <- REFER CONSTRUCTOR
	class Animal2 {

		Animal2() {
			System.out.println("animal is created");
		}
	}

	class Dog2 extends Animal2 {
		Dog2() {
			super();
			System.out.println("dog is created");
		}
	}

	class TestSuper3 {
		public void main(String args[]) {
			Dog2 d = new Dog2();
		}
		// animal is created
		// dog is created
	}
}
