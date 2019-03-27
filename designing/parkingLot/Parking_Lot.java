package parkingLot;

import java.util.ArrayList;

/*1) The parking lot has multiple levels. Each level has multiple rows of spots.

2) The parking lot can park motorcycles, cars, and buses.

3) The parking lot has motorcycle spots, compact spots, and large spots.

4) A motorcycle can park in any spot.

5) A car can park in either a single compact spot or a single large spot.

6) A bus can park in five large spots that are consecutive and within the same row. It cannot park in small spots.

In the below implementation, we have created an abstract class Vehicle, from which Car, Bus, and Motorcycle inherit. To handle the different parking spot sizes, we have just one class ParkingSpot which has a member variable indicating the size.
 */
public class Parking_Lot {

	// Vehicle and its inherited classes.
	public enum VehicleSize {
		Motorcycle, Compact, Large
	}

	public abstract class Vehicle {
		protected ArrayList<ParkingSpot> parkingSpots = new ArrayList<ParkingSpot>();
		protected String licensePlate;
		protected int spotsNeeded;
		protected VehicleSize size;

		public int getSpotsNeeded() {
			return spotsNeeded;
		}

		public VehicleSize getSize() {
			return size;
		}

		/*
		 * Park vehicle in this spot (among others, potentially)
		 */
		public void parkinSpot(ParkingSpot s) {
			parkingSpots.add(s);
		}

		/*
		 * Remove vehicle from spot, and notify spot that it's gone
		 */
		public void clearSpots() {
		}

		/*
		 * Checks if the spot is big enough for the vehicle (and is available). This *
		 * compares the SIZE only.It does not check if it has enough spots.
		 */
		public abstract boolean canFitinSpot(ParkingSpot spot);
	}

	//BUS
	public class Bus extends Vehicle {
		public Bus() {
			spotsNeeded = 5;
			size = VehicleSize.Large;
		}

		/*
		 * Checks if the spot is a Large. Doesn't check num of spots
		 */
		public boolean canFitinSpot(ParkingSpot spot) {
			return false;
		}
	}

	//CAR
	public class Car extends Vehicle {
		public Car() {
			spotsNeeded = 1;
			size = VehicleSize.Compact;
		}

		/* Checks if the spot is a Compact or a Large. */
		public boolean canFitinSpot(ParkingSpot spot) {
			return false;
		}
	}

	//BIKE
	public class Motorcycle extends Vehicle {
		public Motorcycle() {
			spotsNeeded = 1;
			size = VehicleSize.Motorcycle;
		}

		public boolean canFitinSpot(ParkingSpot spot) {
			return false;
		}
	}

}
