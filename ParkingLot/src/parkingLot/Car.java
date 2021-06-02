package parkingLot;

public class Car extends Vehicle{
	public Car() {
		spotsNeeded=2;
		size=VehicleSize.large;
		}
		public boolean canFitinSpot(Car car) {
			
			return ParkingSpot.canFitVehicle(car);
		}

}
