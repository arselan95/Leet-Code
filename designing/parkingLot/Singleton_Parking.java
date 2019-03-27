package parkingLot;

/*
 * Ways to approach a general Design problem.

Use Cases Generation: Gather all the possible use cases

Constraints and Analysis: How many users, how much data etc.

Basic Design: Most basic design. Few users case.

Bottlenecks: Find the bottlenecks and solve them.

Scalability: A large number of users. 4 and 5 step will go in loop till we get a satisfactory answer

Current Scenario

Use cases for this problem.
	Parking can be single-level or multilevel.
	Types of vehicles that can be parked, separate spaces for each type of vehicle.
	Entry and exit points.

Constraints
	Number of vehicles that can be accommodated of any type.

Basic Design/High-Level Components
	Vehicle/Type of vehicle.
	Entry and Exit points.
	Different spots for vehicles.

Bottlenecks
	Capacity breach for any type of vehicle.

Scalability
	Scalable from single-level to multi-level
	Scalable from Bike only parking to accommodate all kinds of vehicles.
	Keeping these in minds, APIs can be designed in the language of your preference.
 */

public class Singleton_Parking {

	class ParkingLot {
		int TOTAL_PARKING = 100;
		int numsAvailable;

		// constructor
		ParkingLot() {
		}

		// methods
		void increase() {
			numsAvailable++;
		}

		void decrease() {
			numsAvailable--;
		}
	}
	// Singleton pattern
	/*
	 * #define NUM_AVAILABLE_PARKING 100;
	 * 
	 * class ParkingLot { static int m_numOfAvailableParking;
	 * 
	 * // Private Constructor ParkingLot() {}
	 * 
	 * public static ParkingLot& instance() { static auto_ptr parkingLot(new
	 * ParkingLot); return *parkingLot; }
	 * 
	 * static void increase() { m_numOfAvailableParking++; }
	 * 
	 * static void decrease() { m_numOfAvailableParking--; } };
	 */

	class car {

		/*
		 * class Car { 
		 * 
		 * ParkingLot m_parkingLot; 
		 * 
		 * public Car(ParkingLot p) { m_parkingLot(p) };
		 * 
		 * void enter() { m_parkingLot.decrease(); }
		 * 
		 * void exit() { m_parkingLot.increase(); } };
		 */

	}
	
	class parkingMain{
		
		/*
		int ParkingLot::m_numOfAvailableParking = NUM_AVAILABLE_PARKING;

		public static void main(String[] args)
		{
		
		// parkingLot and parkingLot2 are the actually the same which
		// can be verified by m_numOfAvailableParking;
		// This demonstrates parkingLot is a Singleton;
		
		
		ParkingLot parkingLot = ParkingLot::instance();
		ParkingLot parkingLot2 = ParkingLot::instance();

		Car c1(parkingLot);
		Car c2(parkingLot2);

		c1.enter();
		c2.enter();

		c1.exit();
		c2.exit();
		}
	*/
	}
	

}
