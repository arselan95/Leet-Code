package objectOrientedProgramming;

public class Static_Dynamic_INSTANCEBINDING {
	class Animal {
	}

	class Dog extends Animal {
		public void main(String args[]) {
			Dog d1 = new Dog();
		}
	}
	// Here d1 is an instance of Dog class, but it is also an instance of Animal.

	// Example of dynamic binding
	class Animal2 {
		void eat() {
			System.out.println("animal is eating...");
		}
	}

	class Dog2 extends Animal2 {
		void eat() {
			System.out.println("dog is eating...");
		}

		public void main(String args[]) {
			Animal2 a = new Dog2();
			a.eat();
		}
	}// Output:dog is eating...
}
