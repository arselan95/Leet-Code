package objectOrientedProgramming;

/*
 * Polymorphism in Java is a concept by which we can perform a single action in different ways. 
 * Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms.
 *  So polymorphism means many forms.

There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. 
We can perform polymorphism in java by method overloading and method overriding.

If you overload a static method in Java, it is the example of compile time polymorphism. 
Here, we will focus on runtime polymorphism in java.
 */

/*
 * Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is 
 * resolved at runtime rather than compile-time.
 */
public class RUNTIME_POLYMORPHISM {
	class Animal {
		void eat() {
			System.out.println("animal is eating...");
		}
	}

	class Dog extends Animal {
		void eat() {
			System.out.println("dog is eating...");
		}
	}

	class BabyDog1 extends Dog {
		public void main(String args[]) {
			Animal a = new BabyDog1();
			a.eat();
		}//Dog is eating
	}

}