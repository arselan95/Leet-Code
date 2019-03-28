package objectOrientedProgramming;

/*
 * The java instanceof operator is used to test whether the object is an instance of the specified type 
 * (class or subclass or interface).
 */
public class InstanceOF {

	class Animal {
	}

	class Dog1 extends Animal {// Dog inherits Animal

		public void main(String args[]) {
			Dog1 d = new Dog1();
			System.out.println(d instanceof Animal);// true
		}
	}

	/*
	 * Downcasting with java instanceof operator When Subclass type refers to the
	 * object of Parent class, it is known as downcasting. If we perform it
	 * directly, compiler gives Compilation error. If you perform it by typecasting,
	 * ClassCastException is thrown at runtime. But if we use instanceof operator,
	 * downcasting is possible.
	 * 
	 * Dog d=new Animal();//Compilation error If we perform downcasting by
	 * typecasting, ClassCastException is thrown at runtime.
	 * 
	 * Dog d=(Dog)new Animal(); //Compiles successfully but ClassCastException is
	 * thrown at runtime
	 */

	class Animal2 {
	}

	class Dog4 extends Animal2 {
		void method(Animal2 a) {
			Dog4 d = (Dog4) a;// downcasting
			System.out.println("ok downcasting performed");
		}

		public void main(String[] args) {
			Animal2 a = new Dog4();
			// Dog4.method(a);
		}
	}// Output:ok downcasting performed
	
	
	/*
	 * Animal a=new Animal(); Dog.method(a); //Now ClassCastException but not in
	 * case of instanceof operator
	 */
}
