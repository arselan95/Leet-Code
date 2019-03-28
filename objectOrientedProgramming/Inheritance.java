package objectOrientedProgramming;

//WHY INHERITANCE
/*
 * Why use inheritance in java
For Method Overriding (so runtime polymorphism can be achieved).
For Code Reusability.
 */

//WHY NOT MULTIPLE INHERITANCE
/*
 * DIAMOND PROBLEM <-caused by multiple inheritance
 * 
 *  n case of multiple inheritance, suppose class A has two subclasses B and C, 
 *  and a class D has two super classes B and C.
 *  If a method present in A is overridden by both B and C but not by D then from which class D will 
 *  inherit that method B or C? This problem is known as diamond problem.
 */

//IS-A VS HAS-A
/*
 * “IS-A” relationship implies inheritance. 
 * A sub class object is said to have “IS-A” relationship with the super class or interface. 
 * If class A extends B then A “IS-A” B. It is transitive, that is, if class A extends B and class B extends C then A “IS-A” C. 
 * The “instanceof” operator in java determines the “IS-A” relationship.

When a class A has a member reference variable of type B then A “HAS-A” B. It is also known as Aggregation.
 */

//AGGREGATION
/*
 * Aggregation is also known as “HAS-A” relationship. 
 * When class Car has a member reference variable of type Wheel then the relationship between the classes Car and Wheel
 *  is known as Aggregation. Aggregation can be understood as “whole to its parts” relationship.

Car is the whole and Wheel is part. Wheel can exist without the Car. Aggregation is a weak association.
 */

//WHEN USE AGGREGATION
/*
 * Code reuse is also best achieved by aggregation when there is no is-a relationship.
Inheritance should be used only if the relationship is-a is maintained throughout the 
lifetime of the objects involved; otherwise, aggregation is the best choice.
 */

//COMPOSITION
/*
 * Composition is a special form of Aggregation where the part cannot exist without the whole. Composition is a strong Association.
 *  Composition relationship is represented like aggregation with one difference that the diamond shape is filled.
 */

//DEPENDENCY
/*
 * When one class depends on another because it uses that at some point in time then this relationship is known as Dependency. 
 * One class depends on another if the independent class is a parameter variable or local variable of a method of the 
 * dependent class. A Dependency is drawn as a dotted line from the dependent class to the independent class with an open 
 * arrowhead pointing to the independent class.
 */

//ASSOCIATION VS DEPENDENCY
/*
 * The main difference between Association and Dependency is in case of Association one class has an attribute or member 
 * variable of the other class type but in case of Dependency a 
 * method takes an argument of the other class type or a method has a local variable of the other class type.
 */
public class Inheritance {

	// SINGLE INHERITANCE
	class Animal {
		void eat() {
			System.out.println("eating...");
		}
	}

	class Dog extends Animal {
		void bark() {
			System.out.println("barking...");
		}
	}

	class TestInheritance {
		public void main(String args[]) {
			Dog d = new Dog();
			d.bark();
			d.eat();
		}
	}

	// AGGREGATION
	public class Address {
		String city, state, country;

		public Address(String city, String state, String country) {
			this.city = city;
			this.state = state;
			this.country = country;
		}

	}

	public class Emp {
		int id;
		String name;
		Address address;

		public Emp(int id, String name, Address address) {
			this.id = id;
			this.name = name;
			this.address = address;
		}

		void display() {
			System.out.println(id + " " + name);
			System.out.println(address.city + " " + address.state + " " + address.country);
		}

		public void main(String[] args) {
			Address address1 = new Address("gzb", "UP", "india");
			Address address2 = new Address("gno", "UP", "india");

			Emp e = new Emp(111, "varun", address1);
			Emp e2 = new Emp(112, "arun", address2);

			e.display();
			e2.display();

		}
	}

}
